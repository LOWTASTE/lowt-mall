package com.lowt.lowtmall.lowtware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lowt.common.utils.PageUtils;
import com.lowt.lowtmall.lowtware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 11:38:07
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

