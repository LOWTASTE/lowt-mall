package com.lowt.lowtmall.lowtproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lowt.common.utils.PageUtils;
import com.lowt.lowtmall.lowtproduct.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 10:31:19
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

