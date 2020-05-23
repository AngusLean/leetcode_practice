package com.doubleysoft.alg.jzoffer;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QA_5_ReplaceSpaceInStrTest {
    private static List<Tuple<String, String>> testData;

    @Before
    public void init() {
        testData = new ArrayList<Tuple<String, String>>() {{
            add(new Tuple<>("ad3", "ad3"));
            add(new Tuple<>("ad3 ", "ad3%20"));
            add(new Tuple<>("ad3  ", "ad3%20%20"));
            add(new Tuple<>(" ad3  ", "%20ad3%20%20"));
            add(new Tuple<>(" ", "%20"));
        }};
    }

    @Test
    public void replaceSpaceInStr() {
        testData.forEach(row -> {
            String result = QA_5_ReplaceSpaceInStr.replaceSpaceInStr(row.getFirst());
            Assert.assertTrue(row.getSecound().equals(result));
        });
    }
}