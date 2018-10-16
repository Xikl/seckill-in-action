package com.ximo.seckillinaction.util;

import org.springframework.util.DigestUtils;

/**
 * md5工具类
 *
 * @author Ximo
 * @date 2018/10/16 22:29
 */
public class Md5Util {

    private static final String DEFAULT_SALT = "1a2b3c4d";

    public static String inputPassToFormPass(String inputPass) {
        return getMd5(inputPass, DEFAULT_SALT);
    }

    public static String formPassToDBPass(String formPass, String salt) {
        return getMd5(formPass, salt);
    }

    public static String inputPassToDbPass(String inputPass, String saltDB) {
        String formPass = inputPassToFormPass(inputPass);
        return formPassToDBPass(formPass, saltDB);
    }

    /**
     * 加密字符串
     *
     * @param source 源字符串
     * @return 加密后的字符串
     */
    public static String getMd5(String source) {
        return DigestUtils.md5DigestAsHex(source.getBytes());
    }

    /**
     * 获得md5的加密值，传入盐值
     *
     * @param source 源字符串
     * @param salt 盐值
     * @return 加密后的字符串
     */
    private static String getMd5(String source, String salt) {
        String str = saltIt(source, salt);
        return getMd5(str);
    }

    /**
     * 使其加盐
     *
     * @param source 源字符串
     * @param salt 盐值
     * @return 加盐混淆后的字符串
     */
    private static String saltIt(String source, String salt) {
        return ""+salt.charAt(0)+salt.charAt(2) + source +salt.charAt(5) + salt.charAt(4);
    }


}
