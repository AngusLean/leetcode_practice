package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Array_18_4SumTest {
    private Array_18_4Sum array_18_4Sum;
    private Tuple3<int[], Integer, List<List<Integer>>> testData;

    @Before
    public void setUp() throws Exception {
        array_18_4Sum = new Array_18_4Sum();
        testData = new Tuple3<>(new int[]{1, 0, -1, 0, -2, 2}, 0, Arrays.asList(
                Arrays.asList(-1, 0, 0, 1),
                Arrays.asList(-2, -1, 1, 2),
                Arrays.asList(-2, 0, 0, 2)
        ));
    }

    @Test
    public void fourSum() {
        List<List<Integer>> lists = array_18_4Sum.fourSum(testData.getFirst(), testData.getSecound());
    }
}