package cn.sx.ebj.bidding.core.aspect;

import cn.sx.ebj.bidding.core.annotations.SysLog;
import cn.sx.ebj.bidding.core.utils.IPUtil;
import cn.sx.ebj.bidding.core.utils.JSONUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Objects;


@Aspect
@Component
public class LogAspect {
    static final Logger log = LoggerFactory.getLogger(LogAspect.class);

    @Before(value = "@annotation(sysLog)")
    public void Before(JoinPoint joinPoint, SysLog sysLog) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest req = Objects.requireNonNull(attributes).getRequest();
        log.error("功能模块:{},{},开始--{}", joinPoint.getSignature().getName(), sysLog.type().getDesc(), System.currentTimeMillis());
        log.error("请求来源:{},{}", req.getRemoteAddr(), IPUtil.getIpAddr(req));
        log.error("请求URL:{}", req.getRequestURL().toString());
        log.error("请求方式:{}", req.getMethod());
        log.error("响应方法:{}.{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        log.error("请求参数:{}", JSONUtil.toJson(joinPoint.getArgs()));
    }


    @AfterReturning(value = "execution(* cn.sx.ebj.bidding.*.face..*(..))", returning = "obj")
    public void afterReturning(Object obj) {
        log.info(JSONUtil.toJson(obj));
    }

    /**
     * 拦截异常操作
     *
     * @param joinPoint 切点
     * @param e         异常
     */
    @AfterThrowing(value = "execution(* cn.sx.ebj.bidding.*.controller..*(..))", throwing = "e")
    public void throwing(JoinPoint joinPoint, Exception e) {
        log.error("{},异常:,", joinPoint.getSignature().getName(), e);
    }
}
