package com.doubleysoft.alg.common;

import org.junit.Test;

public class ArrayUtilTest {

    @Test
    public void partition() {
        int[] arr = new int[]{1, 5, 6, 3, 2, 7, 8};
        ArrayUtil.partition(arr, 0, arr.length - 1);
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
}