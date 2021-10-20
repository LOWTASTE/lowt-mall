package com.lowt.lowtmall.lowtproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lowt.lowtmall.lowtproduct.dao")
@SpringBootApplication
public class LowtProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(LowtProductApplication.class, args);
    }

}
