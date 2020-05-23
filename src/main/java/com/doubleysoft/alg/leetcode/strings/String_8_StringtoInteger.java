package com.doubleysoft.alg.leetcode.strings;

public class String_8_StringtoInteger {
    public int myAtoi(String str) {
        if (str == null || str.trim().length() == 0) {
            return 0;
        }
        int len = str.length();
        boolean negative = false;
        int i = 0;
        //1. skip all whitespace
        while (str.charAt(i) == ' ') {
            i++;
        }
        //2. determine sign
        if (str.charAt(i) == '-') {
            negative = true;
            i++;
        } else if (str.charAt(i) == '+') {
            negative = false;
            i++;
        }

        int result = 0;
        while (i < len && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            //fuck check. because inter max value is 2,147,483,647
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10) && (str.charAt(i) - '0') > 7) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + (str.charAt(i++) - '0');
        }
        return negative ? result * -1 : result;
    }

}
