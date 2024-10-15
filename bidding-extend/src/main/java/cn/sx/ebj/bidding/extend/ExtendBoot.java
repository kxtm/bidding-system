package cn.sx.ebj.bidding.extend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @name: 外置应用对接
 * 如 MQ  OA 等其他接口服务
 * @author: chunjie
 * @date: 2023-07-15 12:18
 **/
@SpringBootApplication
public class ExtendBoot {
    public static void main(String[] args) {
        SpringApplication.run(ExtendBoot.class,args);
    }
}
