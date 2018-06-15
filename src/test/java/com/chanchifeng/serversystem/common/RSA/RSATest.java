package com.chanchifeng.serversystem.common.RSA;

import java.util.Map;

/**
 * Copyright@znt
 * Author:proschan
 * Date:2018/4/4
 * Description:
 */
public class RSATest {
    public static void main(String[] args) throws Exception {
        String reqStr = "加密证书和RSA加密解密";
        //加密
        Map<String,String> map = Decipher.encryptData(reqStr);

        //解密
        String respStr = Decipher.decryptData(map);
        System.out.println("解密后的数据为=============>" + respStr);
    }
}
