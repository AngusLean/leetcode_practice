package com.doubleysoft.alg.leetcode.array;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 5
 * Output: 2
 *
 * @see <a href="https://leetcode.com/problems/search-insert-position/">35. Search Insert Position</a>
 *
 */
public class Array_35_SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int start = 0, end = len - 1;
        while (start <= end) {
            int middle = (end - start) / 2 + start;
            if (nums[middle] == target) {
                return middle;
            }

            if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return start;
    }
}
