package com.doubleysoft.alg.leetcode.list;

/**
 * @see <a href="https://leetcode.com/problems/climbing-stairs/">70. Climbing Stairs</a>
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * <p>
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class List_70_ClimbingStairs {
    public int climbStairs(int n) {
        return _climbStairs1(n);
//        return _climbStairs(n);
    }

    /**
     * 就是斐波那契数列
     *
     * @param n
     * @return
     */
    private int _climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        return _climbStairs(n - 1) + _climbStairs(n - 2);
    }

    private int _climbStairs1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int f = 2, g = 1;
        while (n-- > 1) {
            f = f + g;
            g = f - g;
        }
        return g;
    }
}
