package com.doubleysoft.alg.leetcode.strings;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
public class String_3_LongestSubstringTestTest {
    private static final Map<String, Integer> testData = new HashMap<String, Integer>() {{
        put("abcabcbb", 3);
        put("bb", 2);
        put("fffffff", 7);
        put("abcderg", 1);
        put("abb", 2);
    }};

    @Test
    public void lengthOfLongestSubstring() {
        testData.entrySet().forEach(row -> {
            //System.out.println(row);
            Assert.assertEquals(row.getValue().longValue(), String_3_LongestSubstringTest.longestPalindrome(row.getKey()).length());
        });
    }
}