package cn.sx.ebj.bidding.core.utils;

import org.springframework.util.FileCopyUtils;

import java.io.File;

/**
 * 文件类工具
 *
 * @name: FileUtils
 * @author: chunjie
 * @date: 2022-11-12 21:17
 **/

public class FileUtil extends FileCopyUtils {

    /**
     * 判断文件是否存在
     * @param filePath
     * @return
     */
    public static boolean isExist(String filePath) {
        return new File(filePath).exists();
    }



}
