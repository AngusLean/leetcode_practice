package com.doubleysoft.alg.jzoffer;

import com.doubleysoft.alg.leetcode.Tuple;
import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QA_5_PracticeTest {
    private static List<Tuple3<Tuple<int[], Integer>, int[], int[]>> testData;

    @Before
    public void init() {
        testData = new ArrayList<Tuple3<Tuple<int[], Integer>, int[], int[]>>() {{
            add(new Tuple3<>(new Tuple<int[], Integer>(new int[]{1, 3, 4, 0, 0, 0}, 3), new int[]{3, 4, 5}, new int[]{1, 3, 3, 4, 4, 5}));
            add(new Tuple3<>(new Tuple<int[], Integer>(new int[]{1, 0, 0, 0, 0}, 1), new int[]{2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}));
        }};
    }

    @Test
    public void insertSortedArr() {
        testData.forEach(row -> {
            int[] result = QA_5_Practice.insertSortedArr(row.getFirst().getFirst(), row.getFirst().getSecound(), row.getSecound());
            Assert.assertArrayEquals(row.getThird(), result);
        });
    }
}