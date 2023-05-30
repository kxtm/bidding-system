package cn.sx.ebj.bidding.core.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * 控制器基类
 *
 * @name: 控制器基类
 * @author: chunjie
 * @date: 2022-11-12 18:57
 **/
@ControllerAdvice
public abstract class IController {
    protected Logger log = LoggerFactory.getLogger(this.getClass());

}
