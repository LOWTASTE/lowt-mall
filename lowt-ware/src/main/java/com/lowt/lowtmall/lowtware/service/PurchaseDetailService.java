package com.lowt.lowtmall.lowtware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lowt.common.utils.PageUtils;
import com.lowt.lowtmall.lowtware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 11:38:07
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

