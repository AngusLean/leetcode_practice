package com.doubleysoft.alg.leetcode.array;

/**
 * @see <a href="https://leetcode.com/problems/single-number/">136. Single Number</a>
 */
public class Array_136_SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
