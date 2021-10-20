package com.lowt.lowtmall.lowtcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lowt.common.utils.PageUtils;
import com.lowt.lowtmall.lowtcoupon.entity.SmsCouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 11:49:36
 */
public interface SmsCouponService extends IService<SmsCouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

