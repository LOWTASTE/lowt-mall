package com.lowt.lowtmall.lowtcoupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lowt.common.utils.PageUtils;
import com.lowt.common.utils.Query;

import com.lowt.lowtmall.lowtcoupon.dao.SmsSkuBoundsDao;
import com.lowt.lowtmall.lowtcoupon.entity.SmsSkuBoundsEntity;
import com.lowt.lowtmall.lowtcoupon.service.SmsSkuBoundsService;


@Service("smsSkuBoundsService")
public class SmsSkuBoundsServiceImpl extends ServiceImpl<SmsSkuBoundsDao, SmsSkuBoundsEntity> implements SmsSkuBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSkuBoundsEntity> page = this.page(
                new Query<SmsSkuBoundsEntity>().getPage(params),
                new QueryWrapper<SmsSkuBoundsEntity>()
        );

        return new PageUtils(page);
    }

}