package com.lowt.lowtmall.lowtmember.dao;

import com.lowt.lowtmall.lowtmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 12:25:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
