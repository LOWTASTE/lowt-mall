package com.lowt.lowtmall.lowtcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lowt.common.utils.PageUtils;
import com.lowt.lowtmall.lowtcoupon.entity.SmsSkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 11:49:35
 */
public interface SmsSkuFullReductionService extends IService<SmsSkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

