package com.chunjies.bidding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.sx.ebj.bidding.data.dao")
public class BiddingBoot {
    public static void main(String[] args) {
        SpringApplication.run(BiddingBoot.class,args);
    }
}
