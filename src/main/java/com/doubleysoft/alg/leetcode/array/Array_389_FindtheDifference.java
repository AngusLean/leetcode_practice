package com.doubleysoft.alg.leetcode.array;

/**
 * @see <a href="https://leetcode.com/problems/find-the-difference/">389. Find the Difference</a>
 */
public class Array_389_FindtheDifference {
    public static char findTheDifference(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int result = 0;
        for (int i = 0; i < len1; i++) {
            result ^= s.charAt(i) - 'a';
        }
        for (int i = 0; i < len2; i++) {
            result ^= t.charAt(i) - 'a';
        }
        return (char) (result + (int) 'a');
    }
}
