package com.doubleysoft.alg.leetcode.strings;

import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class String_28_strStrTest {
    private List<Tuple3<String, String, Integer>> testData;
    private String_28_strStr string_28_strStr;

    @Before
    public void setUp() throws Exception {
        string_28_strStr = new String_28_strStr();
        testData = new ArrayList<Tuple3<String, String, Integer>>() {{
            add(new Tuple3<>("", "", 0));
            add(new Tuple3<>("hello", "ll", 2));
            add(new Tuple3<>("aaaaa", "bba", -1));
            add(new Tuple3<>("aaaaa", null, -1));
            add(new Tuple3<>("mississippi", "issipi", -1));
        }};
    }

    @Test
    public void strStr() {
        testData.forEach(row -> {
            //System.out.println(row);
            int result = string_28_strStr.strStr(row.getFirst(), row.getSecound());
            Assert.assertTrue(row.getThird() == result);
        });
    }
}