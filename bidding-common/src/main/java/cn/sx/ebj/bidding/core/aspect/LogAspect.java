package cn.sx.ebj.bidding.core.aspect;

import cn.sx.ebj.bidding.core.annotation.SysLog;
import cn.sx.ebj.bidding.core.utils.IPUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
@EnableAspectJAutoProxy(exposeProxy = true)
public class LogAspect {
    static final Logger log = LoggerFactory.getLogger(LogAspect.class);

    @Before(value = "@annotation(sysLog)")
    public void Before(JoinPoint joinPoint, SysLog sysLog) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest req = attributes.getRequest();
        log.info("功能模块:{},{}", sysLog.module().getType(),sysLog.type().getDesc());
        log.info("请求来源:{},{}", req.getRemoteAddr(), IPUtil.getIpAddr(req));
        log.info("请求URL:{}", req.getRequestURL().toString());
        log.info("请求方式:{}", req.getMethod());
        log.info("响应方法:{}.{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        log.info("请求参数:{}", Arrays.toString(joinPoint.getArgs()));
    }

    /**
     * 处理完请求后执行
     *
     * @param joinPoint 切点
     */
    @AfterReturning(pointcut = "@annotation(sysLog)", returning = "jsonResult")
    public void After(JoinPoint joinPoint, SysLog sysLog, Object jsonResult) {
        log.info("功能模块:{}", sysLog.desc());
        log.info("返回数据:{}", jsonResult);
    }

    /**
     * 拦截异常操作
     *
     * @param joinPoint 切点
     * @param e         异常
     */
    @AfterThrowing(value = "@annotation(sysLog)", throwing = "e")
    public void throwing(JoinPoint joinPoint, SysLog sysLog, Exception e) {
        log.info("功能模块:{}", sysLog.desc());
        log.error("{}.{}处理异常:{},", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(), e);
    }
}
