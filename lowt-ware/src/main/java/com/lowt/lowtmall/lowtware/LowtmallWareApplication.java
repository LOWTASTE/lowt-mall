package com.lowt.lowtmall.lowtware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LowtmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(LowtmallWareApplication.class, args);
    }

}
