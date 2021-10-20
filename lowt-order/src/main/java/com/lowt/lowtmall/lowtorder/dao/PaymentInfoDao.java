package com.lowt.lowtmall.lowtorder.dao;

import com.lowt.lowtmall.lowtorder.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 12:27:37
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
