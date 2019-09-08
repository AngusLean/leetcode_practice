package com.doubleysoft.alg.leetcode.array;

import java.util.Arrays;

/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * <p>
 * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 * <p>
 * The replacement must be in-place and use only constant extra memory.
 * <p>
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * <p>
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 *
 * @see <a href="https://leetcode.com/problems/next-permutation/">31. Next Permutation</a>
 */
public class Array_31_NextPermutation {
    public void nextPermutation(int[] nums) {
        int len = nums.length;

        if (len == 0 || len == 1) {
            return;
        }
        int i = len - 1;
        while (i > 0) {
            if (nums[i - 1] < nums[i]) {
                break;
            }
            i--;
        }
        if (i == 0) {
            Arrays.sort(nums);
            return;
        }
        if (i == len - 1) {
            swap(nums, len - 2, len - 1);
            return;
        }
        i = i - 1;
        for (int j = len - 1; j >= 0 && j > i; j--) {
            if (nums[j] > nums[i]) {
                swap(nums, i, j);
                Arrays.sort(nums, i + 1, len);
                break;
            }
        }
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }


}
