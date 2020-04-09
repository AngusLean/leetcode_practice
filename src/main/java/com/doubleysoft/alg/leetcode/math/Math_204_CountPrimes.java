package com.doubleysoft.alg.leetcode.math;

public class Math_204_CountPrimes {
    public static int countPrimes1(int n) {
        if (n < 2) {
            return 0;
        }
        boolean[] notPrime = new boolean[n];
        notPrime[0] = true;
        notPrime[1] = true;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                for (int j = i; j * i < n; j++) {
                    notPrime[j * i] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!notPrime[i]) count++;
        }
        return count;
    }

    public static int countPrimes(int n) {
        if (n <= 1) return 0;

        boolean[] notPrime = new boolean[n];
        notPrime[0] = true;
        notPrime[1] = true;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!notPrime[i]) {
                for (int j = 2; j * i < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < notPrime.length; i++) {
            if (!notPrime[i]) count++;
        }
        return count;
    }
}
