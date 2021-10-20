package com.lowt.lowtmall.lowtmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lowt.common.utils.PageUtils;
import com.lowt.lowtmall.lowtmember.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author lowt
 * @email lowtaste@foxmal.com
 * @date 2021-09-06 12:25:48
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

