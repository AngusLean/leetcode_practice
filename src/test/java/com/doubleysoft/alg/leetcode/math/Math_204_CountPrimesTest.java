package com.doubleysoft.alg.leetcode.math;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Math_204_CountPrimesTest {
    private List<Tuple<Integer, Integer>> testData;

    @Before
    public void init() {
        testData = new ArrayList<Tuple<Integer, Integer>>() {{
            add(new Tuple<>(10, 4));
            add(new Tuple<>(4, 2));
        }};
    }

    @Test
    public void countPrimes() {
        testData.forEach(row -> {
            //System.out.println(row);
            int result = Math_204_CountPrimes.countPrimes1(row.getFirst());
            Assert.assertEquals(row.getSecound().intValue(), result);
        });
    }
}