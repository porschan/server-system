package com.chanchifeng.serversystem.common.RSACryptography;

import org.junit.Test;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 * Copyright@znt
 * Author:proschan
 * Date:2018/4/4
 * Description:
 */
public class RSACryptographyTest3 {

    @Test
    public void RSATest() throws Exception {
        //获取公钥
        PublicKey publicKey=getPublicKey(publicKeyString);

        //获取私钥
        PrivateKey privateKey=getPrivateKey(privateKeyString);

        //公钥加密
        byte[] encryptedBytes=encrypt(data.getBytes(), publicKey);
        System.out.println("加密后："+new String(encryptedBytes));

        //私钥解密
        byte[] decryptedBytes=decrypt(encryptedBytes, privateKey);
        System.out.println("解密后："+new String(decryptedBytes));
    }

    public static String data="hello world";
    public static String publicKeyString="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnUq1ZA6C+EzEk+6iBBJlRkchZydNFN+Ufd2IICsb8zc/UZmRqrcQbV3y9C9BBd8DLu9qR5+6t6I+950kdvhOYmO1JNkI7MJc8+AckeQ8hTnMO5SVKvyTX52tUBiXd5k1FXP4esnWOjENxZz2DJZyigZzkEGu4oPThOZS7IE8vSwIDAQAB";
    public static String privateKeyString="MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKdSrVkDoL4TMST7qIEEmVGRyFnJ00U35R93YggKxvzNz9RmZGqtxBtXfL0L0EF3wMu72pHn7q3oj73nSR2+E5iY7Uk2Qjswlzz4ByR5DyFOcw7lJUq/JNfna1QGJd3mTUVc/h6ydY6MQ3FnPYMlnKKBnOQQa7ig9OE5lLsgTy9LAgMBAAECgYBzKbl8Ab459NWnYbqZikPIW7Fs8zeBdbYykSWc6WYKC9HWm97TeeP2+aE2MJJW7Qh6cUI/mEWz1tRQXYb6fJ/ZE8n4Lb888X1V3aO+2SItjupugOIFFMjePwqr7UEODIgPAMxqj13EGRviECqg5Sj3GD1qEOCWvSpPyzpuF/bjqQJBAM+HWNE6vz6mldw//6Pk+PMTnaJ7xIW4T/5FWiQzg21l+bJDi0QtVlxqM9cBKIuxCYbh6Io+TeGNBG7LXnzxdMUCQQDOZ1RnAfDpK4QUgorpNzft/ya8KetAy+w5TWoi+yvXBJg3qdqp9P+ga46NDy1rrwRYaUceZLhfFpuratp3DvTPAkEAoQ5MGoy6EPgdg4HTdrFjltnZU1k0SgahZhcSftfPnp4ua29J7I424J+3PZvziH3Lg/dcjbUOogXbs9R2rwaAdQJAD8aEA+95C0lBKhQkK9kFlFIpEr6ddXFgl6ycDRpnamK2g6KezNil5QvzdEKRtSZGTb+WKPOHx/TBZyOemPTyrwJBAIq8DA+576fnNW1YC4YQ2Pcar7OrbqVHVebDNMvUb4X34aToE+Otn0Vn1oId2yP/+1BS1dqx7aSZe9R2LbeyRcU=";

    //将base64编码后的公钥字符串转成PublicKey实例
    public static PublicKey getPublicKey(String publicKey) throws Exception{
        byte[ ] keyBytes= Base64.getDecoder().decode(publicKey.getBytes());
        X509EncodedKeySpec keySpec=new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory= KeyFactory.getInstance("RSA");
        return keyFactory.generatePublic(keySpec);
    }

    //将base64编码后的私钥字符串转成PrivateKey实例
    public static PrivateKey getPrivateKey(String privateKey) throws Exception{
        byte[ ] keyBytes=Base64.getDecoder().decode(privateKey.getBytes());
        PKCS8EncodedKeySpec keySpec=new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory=KeyFactory.getInstance("RSA");
        return keyFactory.generatePrivate(keySpec);
    }

    //公钥加密
    public static byte[] encrypt(byte[] content, PublicKey publicKey) throws Exception{
        Cipher cipher= Cipher.getInstance("RSA");//java默认"RSA"="RSA/ECB/PKCS1Padding"
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(content);
    }

    //私钥解密
    public static byte[] decrypt(byte[] content, PrivateKey privateKey) throws Exception{
        Cipher cipher=Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(content);
    }
}
