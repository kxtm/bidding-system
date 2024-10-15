package cn.sx.ebj.bidding.common.annotation;

import cn.sx.ebj.bidding.common.enums.ModuleType;
import cn.sx.ebj.bidding.common.enums.OperType;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE_PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface SysLog {

    //模块
    ModuleType module() default ModuleType.EMPTY;

    //功能
    String func() default "";

    //描述
    String desc() default "";

    //操作类型
    OperType type() default OperType.EMPTY;
}
