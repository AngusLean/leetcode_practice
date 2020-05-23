package com.doubleysoft.alg.common;

import org.junit.Test;

public class ModUtilTest {

    @Test
    public void powAndMod() {
        int val = ModUtil.powAndMod(5, 1003, 17);
        System.out.println(val);
    }

    @Test
    public void testMaxPalindrome() {
        ModUtilTest modUtilTest = new ModUtilTest();
        String abcdcbaaa = modUtilTest.maxPalindrome("abcdcbaaa");
        System.out.println(abcdcbaaa);
        String abccbdsf = modUtilTest.maxPalindrome("abccbdsf");
        System.out.println(abccbdsf);
    }

    private String maxPalindrome(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            String leftVal = palindrome(str, i, i);
            String rightVal = palindrome(str, i, i + 1);
            res = res.length() < leftVal.length() ? leftVal : res;
            res = res.length() < rightVal.length() ? rightVal : res;
        }
        return res;
    }

    private String palindrome(String str, int left, int right) {
        while (left > 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right - left - 1);
    }
}