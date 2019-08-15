package com.doubleysoft.alg.leetcode.array;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which
 * has the largest sum and return its sum.
 *
 * @see <a href="https://leetcode.com/problems/maximum-subarray/">53. Maximum Subarray</a>
 */
public class Array_53_MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int before = 0, maxSum = nums[0];
        for (int i = 0; i < len; i++) {
            if (before > 0) {
                before += nums[i];
            } else {
                before = nums[i];
            }
            if (before > maxSum) {
                maxSum = before;
            }
        }
        return maxSum;
    }

}
