package com.lowt.lowtmall.lowtcoupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lowt.lowtmall.lowtcoupon.entity.SmsCategoryBoundsEntity;
import com.lowt.lowtmall.lowtcoupon.service.SmsCategoryBoundsService;
import com.lowt.common.utils.PageUtils;
import com.lowt.common.utils.R;



/**
 * 商品分类积分设置
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 11:49:36
 */
@RestController
@RequestMapping("lowtcoupon/smscategorybounds")
public class SmsCategoryBoundsController {
    @Autowired
    private SmsCategoryBoundsService smsCategoryBoundsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("lowtcoupon:smscategorybounds:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsCategoryBoundsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("lowtcoupon:smscategorybounds:info")
    public R info(@PathVariable("id") Long id){
		SmsCategoryBoundsEntity smsCategoryBounds = smsCategoryBoundsService.getById(id);

        return R.ok().put("smsCategoryBounds", smsCategoryBounds);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("lowtcoupon:smscategorybounds:save")
    public R save(@RequestBody SmsCategoryBoundsEntity smsCategoryBounds){
		smsCategoryBoundsService.save(smsCategoryBounds);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("lowtcoupon:smscategorybounds:update")
    public R update(@RequestBody SmsCategoryBoundsEntity smsCategoryBounds){
		smsCategoryBoundsService.updateById(smsCategoryBounds);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("lowtcoupon:smscategorybounds:delete")
    public R delete(@RequestBody Long[] ids){
		smsCategoryBoundsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
