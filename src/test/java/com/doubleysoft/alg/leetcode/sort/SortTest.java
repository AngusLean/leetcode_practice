package com.doubleysoft.alg.leetcode.sort;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SortTest {
    private static final List<Tuple<int[], int[]>> testData;

    static {
        testData = Arrays.asList(
                new Tuple<>(new int[]{1, 3, 5, 6, 2}, new int[]{1, 2, 3, 5, 6}),
                new Tuple<>(new int[]{}, new int[]{}),
                new Tuple<>(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6}),
                new Tuple<>(new int[]{4, 5, 4, 4, 4}, new int[]{4, 4, 4, 4, 5})
        );
    }

    @Test
    public void quickSortTest() {
        QuickSort quickSort = new QuickSort();
        doSortTest(quickSort);
    }

    private void doSortTest(Sort sort) {
        for (Tuple<int[], int[]> data : testData) {
            sort.sort(data.getFirst());
            Assert.assertArrayEquals(data.getFirst(), data.getSecound());
        }
    }
}