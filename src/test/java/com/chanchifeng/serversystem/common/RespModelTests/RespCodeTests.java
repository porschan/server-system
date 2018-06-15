package com.chanchifeng.serversystem.common.RespModelTests;

import com.chanchifeng.serversystem.common.RespModel.RespCode;
import org.junit.Test;

/**
* @author:porschan
* @description: 学习并使用Emum
* @date: Created in 11:47 2018/6/15
* @modified By:
*/
public class RespCodeTests {

    @Test
    public void RespCodeTest(){
        System.out.println(RespCode.CODE_SUCCESS.getMsg());
        System.out.println(RespCode.CODE_SUCCESS.getCode());
    }

    @Test
    public void test1(){
        //输出某一枚举的值
        System.out.println( Color.RED.getName() );
        System.out.println( Color.RED.getIndex() );
    }
}

enum Color {

    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);


    private String name ;
    private int index ;

    private Color( String name , int index ){
        this.name = name ;
        this.index = index ;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }


}