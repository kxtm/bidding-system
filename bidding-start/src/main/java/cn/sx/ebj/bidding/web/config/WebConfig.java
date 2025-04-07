package cn.sx.ebj.bidding.web.config;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @name: WebConfig
 * @author: chunjie
 * @date: 2023-07-18 19:27
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public AuthConfig securityCfg() {
        return new AuthConfig();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedHeaders("*").allowedMethods("*").allowedOriginPatterns("*").allowCredentials(true);
        WebMvcConfigurer.super.addCorsMappings(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       // registry.addInterceptor(securityCfg()).addPathPatterns("/**").excludePathPatterns("/auth/login");
        WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Bean
    public ValidatorFactory validatorFactory() {
        return Validation.byProvider(HibernateValidator.class).configure().failFast(true).buildValidatorFactory();
    }

    @Bean
    public Validator validator(ValidatorFactory validatorFactory) {
        return validatorFactory.getValidator();
    }
}
