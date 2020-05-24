package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.common.ArrayUtil;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * You may assume nums1 and nums2 cannot be both empty.
 * <p>
 * Example 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * Example 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 *
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">4.Median of Two Sorted Arrays</a>
 */
public class Array_4_MedianOfTwoSortedArrays {
    /**
     * 时间复杂度n+m+log(n+m),不符合题目要求
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = ArrayUtil.mergeSortedArr(nums1, nums2);
        int newLen = arr.length;
        if (newLen % 2 != 0) {
            return arr[newLen / 2] * 1.0;
        }
        return (arr[newLen / 2] + arr[newLen / 2 - 1]) / 2.0;
    }

    private static int[] merge(int[] min, int[] max) {
        int[] result = new int[min.length + max.length];
        int right = 0;
        int i = 0;
        int idx = 0;
        while (i < min.length) {
            if (right >= max.length || min[i] <= max[right]) {
                result[idx++] = min[i];
                i++;
            } else {
                result[idx++] = max[right++];
            }
        }

        if (right < max.length) {
            for (i = right; i < max.length; i++) {
                result[idx++] = max[i];
            }
        }

        return result;
    }
}
