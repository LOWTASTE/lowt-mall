package com.lowt.lowtmall.lowtorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lowt.common.utils.PageUtils;
import com.lowt.lowtmall.lowtorder.entity.OmsOrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 11:43:17
 */
public interface OmsOrderReturnReasonService extends IService<OmsOrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

