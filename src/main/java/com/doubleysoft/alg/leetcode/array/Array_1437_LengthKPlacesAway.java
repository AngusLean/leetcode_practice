package com.doubleysoft.alg.leetcode.array;

/**
 * Given an array nums of 0s and 1s and an integer k, return True if all 1's are at least k places away from each other, otherwise return False.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: nums = [1,0,0,0,1,0,0,1], k = 2
 * Output: true
 * Explanation: Each of the 1s are at least 2 places away from each other.
 * Example 2:
 * <p>
 * <p>
 * <p>
 * Input: nums = [1,0,0,1,0,1], k = 2
 * Output: false
 * Explanation: The second 1 and third 1 are only one apart from each other.
 * Example 3:
 * <p>
 * Input: nums = [1,1,1,1,1], k = 0
 * Output: true
 * Example 4:
 * <p>
 * Input: nums = [0,1,0,1], k = 1
 * Output: true
 *
 * @see <a href="https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/">1437. Check If All 1's Are at Least Length K Places Away</a>
 */
public class Array_1437_LengthKPlacesAway {
    public boolean kLengthApart(int[] nums, int k) {
        if (nums.length <= 1) {
            return false;
        }
        int minDis = Integer.MAX_VALUE;
        int left = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (left == -1) {
                    left = i;
                } else {
                    int dif = i - left - 1;
                    if (dif < minDis) {
                        minDis = dif;
                    }
                    left = i;
                }
            }
        }
        return k <= minDis;
    }
}
