package cn.sx.ebj.bidding.web.config;

import org.springframework.lang.Nullable;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;


/**
 * @name: 拦截器
 * @author: chunjie
 * @date: 2022-11-19 01:12
 **/
public class AuthConfig implements HandlerInterceptor {

    @Override
    public boolean preHandle(@Nullable HttpServletRequest request, @Nullable HttpServletResponse response, @Nullable Object handler) throws Exception {
        return true;
    }
}
