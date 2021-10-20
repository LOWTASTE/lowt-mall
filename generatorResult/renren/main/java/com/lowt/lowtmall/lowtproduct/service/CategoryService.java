package com.lowt.lowtmall.lowtproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lowt.common.utils.PageUtils;
import com.lowt.lowtmall.lowtproduct.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 10:31:19
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

