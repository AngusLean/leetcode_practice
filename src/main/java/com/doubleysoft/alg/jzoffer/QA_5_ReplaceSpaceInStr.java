package com.doubleysoft.alg.jzoffer;

/**
 * replace space in string with %20
 */
public class QA_5_ReplaceSpaceInStr {
    public static String replaceSpaceInStr(String str) {
        if (str == null) {
            return null;
        }
        int len = str.length();
        int numOfSp = 0;
        for (int i = 0; i < len; i++) {
            if (Character.isSpaceChar(str.charAt(i))) {
                numOfSp++;
            }
        }
        int newLen = len + numOfSp * 2;
        char[] result = new char[newLen];
        int right = result.length - 1;
        for (int i = len - 1; i >= 0; i--) {
            if (!Character.isSpaceChar(str.charAt(i))) {
                result[right--] = str.charAt(i);
            } else {
                result[right--] = '0';
                result[right--] = '2';
                result[right--] = '%';
            }
        }
        return new String(result);
    }
}
