package cn.sx.ebj.bidding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.sx.ebj.bidding.data.dao")
public class MangerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MangerApplication.class,args);
    }
}
