package com.doubleysoft.alg.leetcode.bit;

public class QA_191_Numberof1Bits {
    public static int hammingWeight(int n) {
        if (n == 0) {
            return 0;
        }
        int num = 0;
        while (n > 0) {
            int val = n & 1;
            if (val == 1) {
                num++;
            }
            n = n >>> 1;
        }
        return num;
    }
}
