package cn.sx.ebj.bidding.core.aspect;

import cn.sx.ebj.bidding.core.annotation.SysLog;
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
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


@Aspect
@Component
@EnableAspectJAutoProxy(exposeProxy = true)
public class LogAspect {
    static final Logger log = LoggerFactory.getLogger(LogAspect.class);

    @Before(value = "@annotation(sysLog)")
    public void Before(JoinPoint joinPoint, SysLog sysLog) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert attributes != null;
        HttpServletRequest req = attributes.getRequest();
        log.error("功能模块:{},{},开始--{}", joinPoint.getSignature().getName(), sysLog.type().getDesc(), System.currentTimeMillis());
        log.error("请求来源:{},{}", req.getRemoteAddr(), IPUtil.getIpAddr(req));
        log.error("请求URL:{}", req.getRequestURL().toString());
        log.error("请求方式:{}", req.getMethod());
        log.error("响应方法:{}.{}",joinPoint.getSignature().getDeclaringTypeName(),joinPoint.getSignature().getName());
        log.error("请求参数:{}", JSONUtil.toJson(joinPoint.getArgs()));
    }

    /**
     * 处理完请求后执行
     */
    @AfterReturning(pointcut = "@annotation(sysLog)", returning = "jsonResult")
    public void After(JoinPoint joinPoint, SysLog sysLog, Object jsonResult) {
        log.error(" 返回数据:{}", JSONUtil.toJson(jsonResult));
        log.error(" 功能模块:{},{} 结束--{}", joinPoint.getSignature().getName(), sysLog.desc(), System.currentTimeMillis());
    }

    /**
     * 拦截异常操作
     *
     * @param joinPoint 切点
     * @param e         异常
     */
    @AfterThrowing(value = "@annotation(sysLog)", throwing = "e")
    public void throwing(JoinPoint joinPoint, SysLog sysLog, Exception e) {
        log.error("{},{}异常:,", joinPoint.getSignature().getName(), sysLog.desc(), e);
    }
}
