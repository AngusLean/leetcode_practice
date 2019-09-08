package com.doubleysoft.alg.leetcode.array;

/**
 * @author cupofish@gmail.com
 * 9/8/19 16:44
 */
public class Array_33_SearInRotatedArray {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return -1;
        } else if (len == 1) {
            return nums[0] == target ? 0 : -1;
        }
        if (target < nums[0] && target > nums[len - 1]) {
            return -1;
        }
        int left = 0, right = len - 1;
        while (left >= 0 && left <= right && right <= len - 1) {
            int middle = (right - left) / 2 + left;
            if (nums[middle] == target) {
                return middle;
            } else {
                //整个序列未被旋转
                if (nums[left] < nums[right]) {
                    if (nums[middle] < target) {
                        left = middle + 1;
                    } else {
                        right = middle - 1;
                    }
                } else {
                    //当前处于被旋转的子序列上
                    if (nums[middle] > nums[right]) {
                        if (nums[middle] > target && nums[right] < target) {
                            right = middle - 1;
                        } else {
                            left = middle + 1;
                        }
                    } else {
                        //当前处于未被旋转的子序列上
                        if (nums[middle] > target) {
                            right = middle - 1;
                        } else {
                            if (nums[right] < target) {
                                right = middle - 1;
                            } else {
                                left = middle + 1;
                            }
                        }
                    }
                }
            }
        }
        return -1;

    }
}
