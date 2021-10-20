package com.lowt.lowtmall.lowtproduct.dao;

import com.lowt.lowtmall.lowtproduct.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 10:31:19
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
