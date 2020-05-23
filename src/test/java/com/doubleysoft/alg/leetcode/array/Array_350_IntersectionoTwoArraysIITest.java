package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.common.ArrayUtilTest;
import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Array_350_IntersectionoTwoArraysIITest {
    private List<Tuple3<int[], int[], int[]>> testData;

    @Before
    public void setUp() throws Exception {
        testData = new ArrayList<Tuple3<int[], int[], int[]>>() {{
            add(new Tuple3<>(new int[]{1, 2, 2, 1}, new int[]{2, 2}, new int[]{2, 2}));
            add(new Tuple3<>(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}, new int[]{4, 9}));
        }};
    }

    @Test
    public void intersect() {
        testData.forEach(row -> {
            int[] result = Array_350_IntersectionoTwoArraysII.intersect(row.getFirst(), row.getSecound());
            ArrayUtilTest.testIntArrEqual(row.getThird(), result);
        });
    }
}