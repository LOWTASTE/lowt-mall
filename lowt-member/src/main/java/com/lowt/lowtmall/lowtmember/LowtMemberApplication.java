package com.lowt.lowtmall.lowtmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.lowt.lowtmall.lowtmember.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class LowtMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(LowtMemberApplication.class, args);
    }

}
