package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Array_389_FindtheDifferenceTest {
    private List<Tuple3<String, String, Character>> testData;

    @Before
    public void setUp() throws Exception {
        testData = new ArrayList<Tuple3<String, String, Character>>() {{
            add(new Tuple3("abc", "abcd", 'd'));
            add(new Tuple3("abcd", "abcdf", 'f'));
            add(new Tuple3("", "a", 'a'));
        }};
    }

    @Test
    public void findTheDifference() {
        testData.forEach(row -> {
            System.out.println(row);
            char result = Array_389_FindtheDifference.findTheDifference(row.getFirst(), row.getSecound());
            Assert.assertEquals(row.getThird().charValue(), result);
        });
    }
}