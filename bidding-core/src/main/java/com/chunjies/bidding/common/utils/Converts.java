package com.chunjies.bidding.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;

/**
 * 类型转换工具
 *
 * @name: ConvertUtils
 * @author: chunjie
 * @date: 2022-11-12 21:18
 **/

public class Converts {
    protected static Logger log = LoggerFactory.getLogger(Converts.class);

    /**
     * 转成为对象
     * @param obj
     * @return
     */
    public static String toStr(Object obj) {
        log.info("toStr->{}", obj);
        return ObjectUtils.isEmpty(obj) ? null : String.valueOf(obj);
    }


}
