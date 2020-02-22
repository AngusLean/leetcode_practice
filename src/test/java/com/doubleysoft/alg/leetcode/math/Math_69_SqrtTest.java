package com.doubleysoft.alg.leetcode.math;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Math_69_SqrtTest {
    private List<Tuple<Integer, Integer>> testData;
    private Math_69_Sqrt math_69_sqrt;


    @Before
    public void setUp() throws Exception {
        math_69_sqrt = new Math_69_Sqrt();
        testData = new ArrayList<Tuple<Integer, Integer>>() {{
            add(new Tuple<>(6, 2));
            add(new Tuple<>(1, 1));
            add(new Tuple<>(8, 2));
        }};
    }

    @Test
    public void mySqrt() {
        testData.forEach(row -> {
            System.out.println(row);
            Assert.assertTrue(row.getSecound() == math_69_sqrt.mySqrt(row.getFirst()));
        });
    }
}