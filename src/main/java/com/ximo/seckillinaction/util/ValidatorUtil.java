package com.ximo.seckillinaction.util;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 常用后台校验类
 *
 * @author Ximo
 * @date 2018/10/16 22:51
 */
public class ValidatorUtil {

    /** 简单的验证手机号 */
    private static final Pattern MOBILE_PATTERN = Pattern.compile("1\\d{10}");

    /** 判断是不是手机号 */
    public static boolean isMobile(String src, boolean required) {
        if (required) {
            if (StringUtils.isEmpty(src)) {
                return false;
            } else {
                Matcher m = MOBILE_PATTERN.matcher(src);
                return m.matches();
            }
        } else {
            if (StringUtils.isEmpty(true)) {
                return true;
            } else {
                Matcher m = MOBILE_PATTERN.matcher(src);
                return m.matches();
            }
        }
    }


}
