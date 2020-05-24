package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Array_4_MedianOfTwoSortedArraysTest {
    private List<Tuple3<int[], int[], Double>> testData;

    @Before
    public void setUp() throws Exception {
        testData = new ArrayList<Tuple3<int[], int[], Double>>() {{
            add(new Tuple3<int[], int[], Double>(new int[]{1, 3}, new int[]{2}, 2.0));
            add(new Tuple3<int[], int[], Double>(new int[]{1, 3}, new int[]{2, 2}, 2.0));
            add(new Tuple3<int[], int[], Double>(new int[]{1, 2}, new int[]{3, 4}, 2.5));
            add(new Tuple3<int[], int[], Double>(new int[]{1}, new int[]{2}, 1.5));
            add(new Tuple3<int[], int[], Double>(new int[]{100001}, new int[]{100000}, 100000.5));
        }};
    }

    @Test
    public void findMedianSortedArrays() {
        testData.forEach(row -> {
            double result = Array_4_MedianOfTwoSortedArrays.findMedianSortedArrays(row.getFirst(), row.getSecound());
            Assert.assertEquals(row.getThird().doubleValue(), result, 0.1);
        });
    }
}