package com.doubleysoft.alg.leetcode.strings;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class String_13_RomantoIntegerTest {
    private List<Tuple<String, Integer>> testData;
    private String_13_RomantoInteger string_13_romantoInteger;

    @Before
    public void setUp() throws Exception {
        testData = Arrays.asList(
                new Tuple<>("III", 3),
                new Tuple<>("IV", 4),
                new Tuple<>("IX", 9),
                new Tuple<>("LVIII", 58)
        );
        string_13_romantoInteger = new String_13_RomantoInteger();
    }

    @Test
    public void romanToInt() {
        testData.forEach(row -> {
            int result = string_13_romantoInteger.romanToInt(row.getFirst());
            Assert.assertTrue(result == row.getSecound());
        });
    }

    @Test
    public void romanToInt1() {
        testData.forEach(row -> {
            int result = string_13_romantoInteger.romanToInt1(row.getFirst());
            Assert.assertTrue(result == row.getSecound());
        });
    }
}