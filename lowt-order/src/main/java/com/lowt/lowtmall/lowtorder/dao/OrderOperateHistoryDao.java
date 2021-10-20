package com.lowt.lowtmall.lowtorder.dao;

import com.lowt.lowtmall.lowtorder.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 12:27:38
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
