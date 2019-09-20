package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_118_PascalsTriangleTest {
    private Array_118_PascalsTriangle array_118_pascalsTriangle;
    private Tuple<Integer, List<List<Integer>>> testData;

    @Before
    public void setUp() throws Exception {
        array_118_pascalsTriangle = new Array_118_PascalsTriangle();
        testData = new Tuple<>(5, new ArrayList<List<Integer>>() {{
            add(Arrays.asList(1));
            add(Arrays.asList(1, 1));
            add(Arrays.asList(1, 2, 1));
            add(Arrays.asList(1, 3, 3, 1));
            add(Arrays.asList(1, 4, 6, 4, 1));
        }});
    }

    @Test
    public void generate() {
        List<List<Integer>> result = array_118_pascalsTriangle.generate(testData.getFirst());
        boolean isEquals = result.equals(testData.getSecound());
        Assert.assertTrue(isEquals);
    }
}