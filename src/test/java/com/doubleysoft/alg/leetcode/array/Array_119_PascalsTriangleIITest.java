package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Array_119_PascalsTriangleIITest {
    private Array_119_PascalsTriangleII array_119_pascalsTriangleII;

    private Tuple<Integer, List<Integer>> testData;

    @Before
    public void setUp() throws Exception {
        array_119_pascalsTriangleII = new Array_119_PascalsTriangleII();
        testData = new Tuple<>(3, Arrays.asList(1, 3, 3, 1));
    }

    @Test
    public void getRow() {
        List<Integer> result = array_119_pascalsTriangleII.getRow(testData.getFirst());
        Assert.assertTrue(testData.getSecound().equals(result));
    }
}