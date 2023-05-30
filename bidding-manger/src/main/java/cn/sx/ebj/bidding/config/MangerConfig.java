package cn.sx.ebj.bidding.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置类
 *
 * @name: WebConfig
 * @author: chunjie
 * @date: 2022-11-12 18:05
 **/
@Configuration
public class MangerConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedHeaders("*").allowedOriginPatterns("*").allowCredentials(true).allowedMethods("*");
    }

}
