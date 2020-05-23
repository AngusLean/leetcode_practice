package com.doubleysoft.alg.leetcode.array;

import java.util.Arrays;

public class Array_350_IntersectionoTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;

        int[] minArr = nums1, maxArr = nums2;
        if (len1 > len2) {
            minArr = nums2;
            maxArr = nums1;
        }

        for (int i = 0; i < maxArr.length; i++) {
            for (int j = 0; j < minArr.length; j++) {
                if (maxArr[i] == minArr[j]) {
                    boolean inter = true;
                    for (int k = j; k < minArr.length; k++) {
                        if (j + k >= minArr.length || maxArr[i + k] != minArr[j + k]) {
                            inter = false;
                            break;
                        }
                    }
                    if (inter) {
                        return Arrays.copyOfRange(maxArr, i, i + minArr.length);
                    }
                }
            }

        }
        return new int[]{};
    }

    /*private boolean isIntArrEqual(int[] arr1, int begin1, int[] arr2, int begin2){
    }*/
}
