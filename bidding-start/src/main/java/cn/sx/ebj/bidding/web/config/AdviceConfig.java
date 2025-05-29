package cn.sx.ebj.bidding.web.config;

import cn.sx.ebj.bidding.core.base.Result;
import cn.sx.ebj.bidding.core.enums.BizMsgType;
import cn.sx.ebj.bidding.core.exception.BizException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.NoHandlerFoundException;


import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class AdviceConfig {
    Logger logger = LoggerFactory.getLogger(AdviceConfig.class);

    @ExceptionHandler(BizException.class)
    public Result<String> bizException(BizException e, HandlerMethod method) {
        logger.error("bizException:处理方法->{}", method, e);
        return Result.error(e.getMsg());
    }

    @ExceptionHandler(BindException.class)
    public Result<String> bindException(BindException e, HandlerMethod method) {
        logger.error("bindException:处理方法->{}", method, e);
        List<String> collect = e.getBindingResult().getFieldErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList());
        return Result.error(collect.get(0));
    }

    // <2> 处理 json 请求体调用接口校验失败抛出的异常
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<String> methodArgumentNotValidException(MethodArgumentNotValidException e, HandlerMethod method) {
        logger.error("bindException:处理方法->{}", method, e);
        List<String> collect = e.getBindingResult().getFieldErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList());
        return Result.error(collect.get(0));
    }


    @ExceptionHandler(ConstraintViolationException.class)
    public Result<String> constraintViolationException(ConstraintViolationException e, HandlerMethod method) {
        logger.error("bindException:处理方法->{}", method, e);
        List<String> collect = e.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
        return Result.error(collect.get(0));
    }

    /**
     * 处理异常
     *
     * @param e otherException
     */
    @ExceptionHandler(Exception.class)
    public Result<String> exception(Exception e, HandlerMethod method) {
        logger.error("exception：{}异常", method, e);
        return Result.error(e.getMessage());
    }

    /**
     * 处理空指针的异常
     *
     * @param e NullPointerException
     *          {@code @description} 空指针异常定义为前端传参错误，返回400
     */
    @ExceptionHandler(NullPointerException.class)
    public Result<String> nullPointerException(NullPointerException e) {
        logger.error("空指针异常 NullPointerException ", e);
        return Result.error(e.getMessage());
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public Result<?> noHandlerFound(NoHandlerFoundException e) {
        logger.error("noHandlerFound", e);
        return Result.error(BizMsgType.SYS_ERROR.getMsg());
    }

    /**
     * 忽略参数异常处理器
     *
     * @param e 忽略参数异常
     * @return ResponseResult
     */
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Result<String> missingParameterException(MissingServletRequestParameterException e, HttpServletRequest req) {
        logger.error("请求地址{}异常", req.getRequestURI(), e);
        return Result.error(BizMsgType.PARAM_ERROR.getMsg());
    }

    /**
     * 缺少请求体异常处理器
     *
     * @param e 缺少请求体异常
     * @return ResponseResult
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Result<String> paramBodyMissingException(HttpMessageNotReadableException e, HttpServletRequest req) {
        logger.error("请求地址{}异常", req.getRequestURI(), e);
        return Result.error(BizMsgType.PARAM_ERROR.getMsg());
    }
}
