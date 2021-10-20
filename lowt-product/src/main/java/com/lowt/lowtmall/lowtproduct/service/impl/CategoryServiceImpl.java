package com.lowt.lowtmall.lowtproduct.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lowt.common.utils.PageUtils;
import com.lowt.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.lowt.lowtmall.lowtproduct.dao.CategoryDao;
import com.lowt.lowtmall.lowtproduct.entity.CategoryEntity;
import com.lowt.lowtmall.lowtproduct.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    public List<CategoryEntity> listWithTree(){
        // 查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        // 组装成树
        // 找到一级分类
        List<CategoryEntity> categoryEntityList =
        categoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .peek((menu)-> menu.setChildren(getChildren(menu,categoryEntities))).sorted((menu1, menu2)->{
                    return (menu1.getSort()==null?0: menu1.getSort()) - (menu2.getSort()==null?0: menu2.getSort());
                })
                .collect(Collectors.toList());
        // 找到子分类

        return categoryEntities;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        // TODO: 检查是否被引用
        // 逻辑删除
        baseMapper.deleteBatchIds(asList);
    }

    // 递归找子菜单
    private List<CategoryEntity> getChildren(CategoryEntity root,List<CategoryEntity> all){
        return all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).peek(categoryEntity -> categoryEntity.setChildren(getChildren(categoryEntity, all))).sorted((menu1, menu2) -> {
            // 菜单的排序
            return (menu1.getSort()==null?0: menu1.getSort()) - (menu2.getSort()==null?0: menu2.getSort());
        }).collect(Collectors.toList());
    }
}