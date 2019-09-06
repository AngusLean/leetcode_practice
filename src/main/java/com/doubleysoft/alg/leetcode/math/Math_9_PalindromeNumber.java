package com.doubleysoft.alg.leetcode.math;

/**
 * @see <a href="https://leetcode.com/problems/palindrome-number/submissions/">9. Palindrome Number</a>
 */
public class Math_9_PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int addedNum = 0, temp = x;
        while (temp > 0) {
            addedNum = addedNum * 10 + temp % 10;
            temp = temp / 10;
        }
        return addedNum == x;
    }
}
