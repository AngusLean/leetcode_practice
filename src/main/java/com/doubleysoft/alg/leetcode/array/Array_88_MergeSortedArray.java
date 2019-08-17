package com.doubleysoft.alg.leetcode.array;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 *
 * 本方案其实就是插入排序
 */
public class Array_88_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int crt = m;
        for (int i = 0; i < n; i++) {
            nums1[crt] = nums2[i];
            for (int j = crt; j > 0; j--) {
                if (nums1[j - 1] > nums1[j]) {
                    swap(nums1, j - 1, j);
                } else {
                    break;
                }
            }
            crt++;
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
