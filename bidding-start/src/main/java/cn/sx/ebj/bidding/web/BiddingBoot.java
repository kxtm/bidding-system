package cn.sx.ebj.bidding.web;

import cn.sx.ebj.bidding.core.consts.Constr;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan(Constr.MAPPER_PACKAGE)
@ComponentScan(basePackages = {Constr.BASE_PACKAGE})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class BiddingBoot extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BiddingBoot.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BiddingBoot.class, args);
    }
}
