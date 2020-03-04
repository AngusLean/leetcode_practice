package com.doubleysoft.alg.leetcode.strings;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class String_38_CountAndSayTest {
    private List<Tuple<Integer, String>> testData;
    private String_38_CountAndSay string_38_countAndSay;

    @Before
    public void init() {
        testData = new ArrayList<Tuple<Integer, String>>() {{
            add(new Tuple(1, "1"));
            add(new Tuple(2, "11"));
            add(new Tuple(3, "21"));
            add(new Tuple(4, "1211"));
            add(new Tuple(5, "111221"));
        }};
        string_38_countAndSay = new String_38_CountAndSay();
    }

    @Test
    public void strStr() {
        testData.forEach(row -> {
            System.out.println(row);
            String result = string_38_countAndSay.countAndSay(row.getFirst());
            Assert.assertEquals(row.getSecound(), result);
        });
    }
}