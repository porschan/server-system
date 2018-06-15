package com.chanchifeng.serversystem.common.utils;

import java.time.LocalDate;

/**
* @author:porschan
* @description: 时间工具类
* @date: Created in 11:46 2018/6/15
* @modified By:
*/
public class TimeUtils {

    //获取当前时间的字符串
    public static String gainTimeStr(){
        return LocalDate.now().toString();
    }
}
