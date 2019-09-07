package com.doubleysoft.alg.leetcode;

import java.util.Arrays;

/**
 * @author cupofish@gmail.com
 * 9/7/19 18:18
 */
public class CommonUtil {
    public static Integer[] intArr2IntegerArr(int[] arr) {
        return Arrays.stream(arr).boxed().toArray(Integer[]::new);
    }

    public static int[] integerArr2IntArr(Integer[] arr) {
        int[] result = new int[arr.length];
        int   i      = 0;
        for (Integer integer : arr) {
            result[i++] = integer.intValue();
        }
        return result;
    }
}
