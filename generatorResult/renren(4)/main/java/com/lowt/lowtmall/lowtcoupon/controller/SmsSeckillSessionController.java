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

import com.lowt.lowtmall.lowtcoupon.entity.SmsSeckillSessionEntity;
import com.lowt.lowtmall.lowtcoupon.service.SmsSeckillSessionService;
import com.lowt.common.utils.PageUtils;
import com.lowt.common.utils.R;



/**
 * 秒杀活动场次
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 11:49:35
 */
@RestController
@RequestMapping("lowtcoupon/smsseckillsession")
public class SmsSeckillSessionController {
    @Autowired
    private SmsSeckillSessionService smsSeckillSessionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("lowtcoupon:smsseckillsession:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsSeckillSessionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("lowtcoupon:smsseckillsession:info")
    public R info(@PathVariable("id") Long id){
		SmsSeckillSessionEntity smsSeckillSession = smsSeckillSessionService.getById(id);

        return R.ok().put("smsSeckillSession", smsSeckillSession);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("lowtcoupon:smsseckillsession:save")
    public R save(@RequestBody SmsSeckillSessionEntity smsSeckillSession){
		smsSeckillSessionService.save(smsSeckillSession);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("lowtcoupon:smsseckillsession:update")
    public R update(@RequestBody SmsSeckillSessionEntity smsSeckillSession){
		smsSeckillSessionService.updateById(smsSeckillSession);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("lowtcoupon:smsseckillsession:delete")
    public R delete(@RequestBody Long[] ids){
		smsSeckillSessionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
