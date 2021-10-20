package com.lowt.lowtmall.lowtcoupon.dao;

import com.lowt.lowtmall.lowtcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 12:22:23
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
