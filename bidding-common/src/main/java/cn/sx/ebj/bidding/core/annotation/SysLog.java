package cn.sx.ebj.bidding.core.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE_PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface SysLog {

    //功能模块
    String func() default "";
    //描述
    String desc() default "";
}
