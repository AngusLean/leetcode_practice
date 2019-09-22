package com.doubleysoft.alg.leetcode.array;

import java.util.Arrays;

/**
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * Example:
 *
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 *
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 * @see <a href="https://leetcode.com/problems/3sum-closest/">16. 3Sum Closest</a>
 */
public class Array_16_3SumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE, diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int right = target - nums[i];
            int rightClosest = twoSumClosest(nums, i + 1, nums.length, right);
            if (Math.abs(right - rightClosest) < diff) {
                diff = Math.abs(right - rightClosest);
                result = nums[i] + rightClosest;
            }
        }
        return result;
    }

    public static int twoSumClosest(int[] nums, int start, int end, int target) {
        int result = Integer.MAX_VALUE, crtDiff = Integer.MAX_VALUE;
        int tempDiff = Integer.MAX_VALUE;
        for (int i = start; i < end - 1; i++) {
            int right = target - nums[i];
            for (int j = i + 1; j < end; j++) {
                int temp = Math.abs(nums[j] - right);
                if (temp < tempDiff) {
                    tempDiff = temp;
                    result = nums[i] + nums[j];
                }
                //注意这里不能因为当前值与目标值的差距大于之前的最小值 而 跳出循环， 因为数组中大小不定，后面
                //可能会有合适的值出现
            }
        }
        return result;
    }
}
