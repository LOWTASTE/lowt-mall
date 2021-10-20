package com.lowt.lowtmall.lowtcoupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * nacos 配置中心
 * boostrap.properties
 * 给配置中心添加数据集 默认规则 应用名.properties
 * 动态刷新配置 @RefreshScope
 * 相同项优先使用配置中心的
 *
 * 命名空间：环境隔离 《开发环境之间》or《微服务之间》public 默认
 * spring.cloud.nacos.config.namespace=28892bd6-4ca8-42e7-a667-15ca5233cd1a
 * 配置集：一组配置文件
 * 配置集ID：类似文件名
 * 配置分组 DEFAULT_GROUP
 * spring.cloud.nacos.config.group=??
 *
 * 多个配置集
 * spring.cloud.nacos.config.ext-config[0].data-id=?
 * spring.cloud.nacos.config.ext-config[0].group=?
 * spring.cloud.nacos.config.ext-config[0].refresh=?
 * */
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class LowtCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(LowtCouponApplication.class, args);
    }

}
