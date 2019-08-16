package com.doubleysoft.alg.leetcode.array;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
public class Array_88_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = 0; i < m; i++) {
            while (j < n) {
                if (nums1[i] > nums2[j]) {
                    swap(nums1, nums2, i, j);
                }
                break;
            }
        }
    }

    private static void swap(int[] nums1, int[] nums2, int i1, int i2) {
        int temp = nums1[i1];
        nums1[i1] = nums2[i2];
        nums2[i2] = temp;
    }
}
