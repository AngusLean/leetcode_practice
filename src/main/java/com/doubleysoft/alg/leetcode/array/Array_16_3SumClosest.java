package com.doubleysoft.alg.leetcode.array;

import java.util.Arrays;

/**
 * @author cupofish@gmail.com
 * 9/7/19 19:05
 */
public class Array_16_3SumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] - 1, diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int val     = nums[i] + nums[left] + nums[right];
                int crtDiff = Math.abs(target - val);
                if (crtDiff < diff) {
                    diff = crtDiff;
                    sum = val;
                    left++;
                } else if (crtDiff > diff) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return sum;
    }
}
