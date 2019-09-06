package com.doubleysoft.alg.leetcode.array;

/**
 * @see <a href="https://leetcode.com/problems/container-with-most-water/">11. Container With Most Water</a>
 */
public class Array_11_ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int len = height.length;
        if (len == 2) {
            return Math.min(height[0], height[1]);
        }
        int max = 0;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                int min = Math.min(height[i], height[j]);
                int water = min * (i - j);
                if (water > max) {
                    max = water;
                }
            }
        }
        return max;
    }
}
