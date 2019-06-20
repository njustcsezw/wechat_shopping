package com.njustz.wechat_shopping.utils;

import java.util.Random;

/**
 * @author njustz
 * @date 2019/6/20
 */
public class KeyUtil {

    //生成唯一的主键
    //格式：时间+随机数
    public static synchronized String genUniqueKey(){
        Random random = new Random();

        Integer number =  random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
