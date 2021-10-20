package com.lowt.lowtmall.lowtcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lowt.common.utils.PageUtils;
import com.lowt.lowtmall.lowtcoupon.entity.SmsCategoryBoundsEntity;

import java.util.Map;

/**
 * 商品分类积分设置
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 11:49:36
 */
public interface SmsCategoryBoundsService extends IService<SmsCategoryBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

