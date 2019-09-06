package com.doubleysoft.alg.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
public class Math_9_PalindromeNumberTest {
    private static Map<Integer, Boolean> testData = new HashMap<Integer, Boolean>() {{
        put(2, true);
        put(-100, false);
        put(11, true);
        put(121, true);
        put(122, false);
        put(12221, true);
        put(1000021, false);
    }};

    @Test
    public void isPalindrome() {
        testData.entrySet().forEach(row -> {
            Assert.assertTrue(row.getValue() == Math_9_PalindromeNumber.isPalindrome(row.getKey()));
        });
    }

}