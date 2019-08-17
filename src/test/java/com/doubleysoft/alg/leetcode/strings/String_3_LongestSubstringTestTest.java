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
        put("fffffff", 1);
        put("abcderg", 7);
    }};

    @Test
    public void lengthOfLongestSubstring() {
        testData.entrySet().forEach(row -> {
            Assert.assertEquals(row.getValue().longValue(), String_3_LongestSubstringTest.lengthOfLongestSubstring(row.getKey()));
        });
    }
}