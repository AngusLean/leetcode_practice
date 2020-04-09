package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Array_268_MissingNumberTest {
    private List<Tuple<int[], Integer>> testData;

    @Before
    public void init() {
        testData = new ArrayList<Tuple<int[], Integer>>() {{
            add(new Tuple<>(new int[]{0}, 1));
            add(new Tuple<>(new int[]{0, 1, 3}, 2));
            add(new Tuple<>(new int[]{0, 1, 3, 4}, 2));
            add(new Tuple<>(new int[]{0, 1, 2}, 3));
        }};
    }

    @Test
    public void testMissInt() {
        testData.forEach(row -> {
            System.out.println(row);
            int result = Array_268_MissingNumber.missingNumber(row.getFirst());
            Assert.assertEquals(row.getSecound().intValue(), result);
        });
    }
}