package cn.sx.ebj.bidding.core.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * 类型转换工具
 *
 * @name: ConvertUtils
 * @author: chunjie
 * @date: 2022-11-12 21:18
 **/

public class ConvertUtil {
    protected static Logger log = LoggerFactory.getLogger(ConvertUtil.class);

    public static String toStr(Object obj) {
        log.info("toStr->{}", obj);
        return (obj != null ? Optional.of(obj).toString() : "");
    }


}
