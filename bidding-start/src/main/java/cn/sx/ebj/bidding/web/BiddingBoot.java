package cn.sx.ebj.bidding.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(value = "cn.sx.ebj.bidding.data.dao")
public class BiddingBoot extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BiddingBoot.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(BiddingBoot.class, args);
    }
}
