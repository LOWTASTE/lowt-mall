package com.lowt.lowtmall.lowtproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lowt.common.utils.PageUtils;
import com.lowt.lowtmall.lowtproduct.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 10:31:18
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

