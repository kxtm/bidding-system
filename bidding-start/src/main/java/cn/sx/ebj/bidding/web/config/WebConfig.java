package cn.sx.ebj.bidding.web.config;

import org.hibernate.validator.HibernateValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Validation;
import javax.validation.Validator;

/**
 * @name: WebConfig
 * @author: chunjie
 * @date: 2023-07-18 19:27
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {
    static Logger log = LoggerFactory.getLogger(WebConfig.class);

    @Bean
    public SecurityCfg securityCfg() {
        return new SecurityCfg();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedHeaders("*").allowedMethods("*").allowedOriginPatterns("*").allowCredentials(true);
        WebMvcConfigurer.super.addCorsMappings(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(securityCfg()).addPathPatterns("/**").excludePathPatterns("/auth/login");
        WebMvcConfigurer.super.addInterceptors(registry);
    }


    @Bean
    public Validator validator() {
        return Validation.byProvider(HibernateValidator.class).configure().failFast(true).buildValidatorFactory().getValidator();
    }
}
