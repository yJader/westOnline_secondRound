package com.yj.regex;

import java.util.regex.Pattern;

/**
 * @Author yJade
 * @Date 2022-12-04 14:07
 * @Package com.yj.regular
 */
public class MyRegex {
    public static boolean isEmail(String email) {
        String regex = "[\\w]+@[\\w]+\\.com";
        return Pattern.matches(regex, email);
    }
}
