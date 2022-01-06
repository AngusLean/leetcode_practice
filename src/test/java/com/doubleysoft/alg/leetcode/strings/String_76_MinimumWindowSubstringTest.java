package com.doubleysoft.alg.leetcode.strings;

import com.doubleysoft.alg.leetcode.Tuple;
import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class String_76_MinimumWindowSubstringTest {
    private List<Tuple3<String, String, String>> testData;
    private String_76_MinimumWindowSubstring minimumWindowSubstring;

    @Before
    public void setUp() throws Exception {
        testData = Arrays.asList(
                new Tuple3<>("ADOBECODEBANC", "ABC", "BANC"),
                new Tuple3<>("a", "a", "a"),
                new Tuple3<>("a", "aa", "")
        );
        minimumWindowSubstring = new String_76_MinimumWindowSubstring();
    }
    @Test
    public void minWindow(){
        testData.forEach(data -> {
            String res = minimumWindowSubstring.minWindow(data.getFirst(), data.getSecound());
            Assert.assertEquals(res, data.getThird());
        });
    }

}