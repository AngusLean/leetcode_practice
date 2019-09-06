package com.doubleysoft.alg.leetcode.list;

/**
 * @email dongyang.yu@anxincloud.com
 */
public class List_01_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        if (len == 2) {
            return new int[]{0, 1};
        }
        int left = 0, right = 1;
        for (int j = 1; j < len; j++) {
            for (int i = left; i < j; i++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new RuntimeException("illegal list");
    }
}
