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

import com.lowt.lowtmall.lowtcoupon.entity.SmsSkuBoundsEntity;
import com.lowt.lowtmall.lowtcoupon.service.SmsSkuBoundsService;
import com.lowt.common.utils.PageUtils;
import com.lowt.common.utils.R;



/**
 * 商品sku积分设置
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 11:49:35
 */
@RestController
@RequestMapping("lowtcoupon/smsskubounds")
public class SmsSkuBoundsController {
    @Autowired
    private SmsSkuBoundsService smsSkuBoundsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("lowtcoupon:smsskubounds:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsSkuBoundsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("lowtcoupon:smsskubounds:info")
    public R info(@PathVariable("id") Long id){
		SmsSkuBoundsEntity smsSkuBounds = smsSkuBoundsService.getById(id);

        return R.ok().put("smsSkuBounds", smsSkuBounds);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("lowtcoupon:smsskubounds:save")
    public R save(@RequestBody SmsSkuBoundsEntity smsSkuBounds){
		smsSkuBoundsService.save(smsSkuBounds);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("lowtcoupon:smsskubounds:update")
    public R update(@RequestBody SmsSkuBoundsEntity smsSkuBounds){
		smsSkuBoundsService.updateById(smsSkuBounds);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("lowtcoupon:smsskubounds:delete")
    public R delete(@RequestBody Long[] ids){
		smsSkuBoundsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
