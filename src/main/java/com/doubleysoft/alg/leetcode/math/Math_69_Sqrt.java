package com.doubleysoft.alg.leetcode.math;

public class Math_69_Sqrt {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        }
        int f = 1;
        int min = 1;
        int max = x;
        while (min < max) {
            int mid = (max + min) / 2;
            if (mid * mid - x > f) {
                max = mid;
            } else if (mid * mid + x < f) {
                min = mid;
            } else {
                return mid;
            }
        }
        return min;
    }

    private int abs(int val) {
        return Math.abs(val);
    }
}
