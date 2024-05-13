package com.chunjies.bidding.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.chunjies")
@MapperScan(value = "com.chunjies.bidding.data.dao")
public class BiddingBoot {
    public static void main(String[] args) {
        SpringApplication.run(BiddingBoot.class, args);
    }
}
