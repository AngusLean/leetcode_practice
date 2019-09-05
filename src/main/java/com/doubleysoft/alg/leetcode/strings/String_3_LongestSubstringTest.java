package com.doubleysoft.alg.leetcode.strings;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 *
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">3. longest-substring-without-repeating-characters</a>
 */
public class String_3_LongestSubstringTest {
    public static String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }
        int len = s.length();
        if (len == 0) {
            return "";
        }
        if (len == 1) {
            return s;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            sb.append("#").append(s.charAt(i));
        }
        sb.append("#");
        String s1     = sb.toString();
        int    len1   = s1.length();
        String result = "";
        for (int i = 1; i < len1 - 1; i++) {
            String max = findLongestPalindromic(s1, i);
            if (max.length() > result.length()) {
                result = max;
            }
        }
        return result.replaceAll("#", "");
    }

    private static String findLongestPalindromic(String s, int i) {
        int    max    = 0;
        int    diff   = s.length() - i;
        String maxStr = s.substring(i, i + 1);
        for (int k = 0; k < i && k < diff; k++) {
            if (s.charAt(i - k) == s.charAt(i + k)) {
                maxStr = s.substring(i - k, i + k + 1);
            } else {
                break;
            }
        }
        return maxStr;
    }
}
