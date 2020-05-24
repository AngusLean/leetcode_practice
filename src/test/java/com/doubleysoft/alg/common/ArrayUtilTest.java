package com.doubleysoft.alg.common;

import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtilTest {

    @Test
    public void partition() {
        int[] arr = new int[]{1, 5, 6, 3, 2, 7, 8};
        ArrayUtil.partition(arr, 0, arr.length - 1);
    }

    @Test
    public void testMergeSortedArr() {
        List<Tuple3<int[], int[], int[]>> testData = new ArrayList<Tuple3<int[], int[], int[]>>() {{
            add(new Tuple3<>(new int[]{}, new int[]{1}, new int[]{1}));
            add(new Tuple3<>(new int[]{1}, new int[]{}, new int[]{1}));
            add(new Tuple3<>(new int[]{1}, new int[]{1}, new int[]{1, 1}));
            add(new Tuple3<>(new int[]{1, 2}, new int[]{1, 2, 3, 4}, new int[]{1, 1, 2, 2, 3, 4}));
            add(new Tuple3<>(new int[]{1, 1}, new int[]{1, 2, 3, 4}, new int[]{1, 1, 1, 2, 3, 4}));
            add(new Tuple3<>(new int[]{1, 2, 3, 4}, new int[]{1, 2}, new int[]{1, 1, 2, 2, 3, 4}));
            add(new Tuple3<>(new int[]{5, 6}, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4, 5, 6}));
        }};
        testData.forEach(row -> {
            int[] result = ArrayUtil.mergeSortedArr(row.getFirst(), row.getSecound());
            Assert.assertArrayEquals(row.getThird(), result);
        });
    }

    public static void testIntArrEqual(Integer[] arr1, Integer[] arr2) {
        for (Integer int1 : arr1) {
            boolean isMatch = false;
            for (Integer int2 : arr2) {
                if (int1.compareTo(int2) == 0) {
                    isMatch = true;
                    break;
                }
            }
            if (!isMatch) {
                throw new RuntimeException("list don't equal");
            }
        }
    }

    public static void testIntArrEqual(int[] arr1, int[] arr2) {
        for (int int1 : arr1) {
            boolean isMatch = false;
            for (int int2 : arr2) {
                if (int1 == int2) {
                    isMatch = true;
                    break;
                }
            }
            if (!isMatch) {
                throw new RuntimeException("list don't equal");
            }
        }
    }
}