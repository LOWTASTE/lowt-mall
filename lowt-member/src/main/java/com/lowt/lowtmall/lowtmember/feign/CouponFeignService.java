package com.lowt.lowtmall.lowtmember.feign;

import com.lowt.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@FeignClient("lowt-coupon")
public interface CouponFeignService {
    @RequestMapping("lowtcoupon/coupon/member/list")
    public R memberCoupons();
}
