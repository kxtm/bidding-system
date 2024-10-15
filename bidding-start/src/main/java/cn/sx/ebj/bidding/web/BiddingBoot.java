package cn.sx.ebj.bidding.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "cn.sx.ebj.bidding.data.dao")
public class BiddingBoot {
    public static void main(String[] args) {
        SpringApplication.run(BiddingBoot.class, args);
    }
}
