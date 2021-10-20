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

import com.lowt.lowtmall.lowtcoupon.entity.SmsHomeSubjectEntity;
import com.lowt.lowtmall.lowtcoupon.service.SmsHomeSubjectService;
import com.lowt.common.utils.PageUtils;
import com.lowt.common.utils.R;



/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 11:49:36
 */
@RestController
@RequestMapping("lowtcoupon/smshomesubject")
public class SmsHomeSubjectController {
    @Autowired
    private SmsHomeSubjectService smsHomeSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("lowtcoupon:smshomesubject:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsHomeSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("lowtcoupon:smshomesubject:info")
    public R info(@PathVariable("id") Long id){
		SmsHomeSubjectEntity smsHomeSubject = smsHomeSubjectService.getById(id);

        return R.ok().put("smsHomeSubject", smsHomeSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("lowtcoupon:smshomesubject:save")
    public R save(@RequestBody SmsHomeSubjectEntity smsHomeSubject){
		smsHomeSubjectService.save(smsHomeSubject);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("lowtcoupon:smshomesubject:update")
    public R update(@RequestBody SmsHomeSubjectEntity smsHomeSubject){
		smsHomeSubjectService.updateById(smsHomeSubject);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("lowtcoupon:smshomesubject:delete")
    public R delete(@RequestBody Long[] ids){
		smsHomeSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
