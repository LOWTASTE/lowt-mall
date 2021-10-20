package com.lowt.lowtmall.lowtproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lowt.common.utils.PageUtils;
import com.lowt.lowtmall.lowtproduct.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 10:31:20
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

