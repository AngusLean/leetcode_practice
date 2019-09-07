package com.doubleysoft.alg.leetcode;

import java.util.Arrays;

/**
 * @author cupofish@gmail.com
 * 9/7/19 18:18
 */
public class CommonUtil {
    public static Integer[] intArr2Integer(int[] arr) {
        return Arrays.stream(arr).boxed().toArray(Integer[]::new);
    }
}
