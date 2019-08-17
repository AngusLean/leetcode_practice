package com.doubleysoft.alg.leetcode.strings;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
public class String_3_LongestSubstringTest {
    public static int lengthOfLongestSubstring(String s) {

        int length = s.length();
        if (length == 0) {
            return 0;
        } else if (length == 1) {
            return 1;
        }
        int len, left = 0;
        int maxLen = 1;
        int i = 0;
        while (i < length) {
            len = 1;
            for (int j = left; j < i; j++) {
                if (s.charAt(j) != s.charAt(i)) {
                    len++;
                    maxLen = len > maxLen ? len : maxLen;
                } else {
                    left = j + 1;
                    maxLen = len > maxLen ? len : maxLen;
                    len = 0;
                }
            }
            i++;
        }
        return maxLen;
    }
}
