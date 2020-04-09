package com.doubleysoft.alg.leetcode.array;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 * <p>
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 *
 * @see <a href="https://leetcode.com/problems/missing-number/">268. Missing Number</a>
 */
public class Array_268_MissingNumber {
    public static int missingNumber(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] >= len) {
                //记录，不反应
            } else if (nums[i] != i) {
                int tmp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = tmp;
                i--;
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        //注意这里要防止最后一个数字不存在的情况下要返回
        return len;
    }
}
