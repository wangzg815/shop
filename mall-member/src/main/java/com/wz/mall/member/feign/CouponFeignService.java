package com.wz.mall.member.feign;

import com.wz.common.utils.R;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ward.wang
 * @since 2021/12/27 19:59
 */

// FeignClient客户端
@FeignClient("mall-coupon")
@LoadBalancerClient("mall-coupon")
public interface CouponFeignService {
    @RequestMapping("coupon/coupon/member/list")
    public R memberCoupons();
}
