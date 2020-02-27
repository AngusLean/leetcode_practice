package com.doubleysoft.alg.common;

import org.junit.Test;

public class ArrayUtilTest {

    @Test
    public void partition() {
        int[] arr = new int[]{1, 5, 6, 3, 2, 7, 8};
        ArrayUtil.partition(arr, 0, arr.length - 1);
    }
}