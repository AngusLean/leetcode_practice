package com.doubleysoft.alg.leetcode.strings;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class String_8StringtoIntegerTest {
    private static List<Tuple<String, Integer>> testData;
    private String_8_StringtoInteger string_8StringtoInteger;

    @Before
    public void setUp() throws Exception {
        string_8StringtoInteger = new String_8_StringtoInteger();
        testData = Arrays.asList(
                new Tuple<>("  123", 123),
                new Tuple<>("  123abc", 123),
                new Tuple<>("  -123abc", -123),
                new Tuple<>("  wdsfsdf", 0),
                new Tuple<>("-91283472332", Integer.MIN_VALUE),
                new Tuple<>("2147483648", 2147483647)
        );
    }

    @Test
    public void myAtoi() {
        testData.forEach(row -> {
            int result = string_8StringtoInteger.myAtoi(row.getFirst());
            Assert.assertTrue(result == row.getSecound());
        });
    }
}