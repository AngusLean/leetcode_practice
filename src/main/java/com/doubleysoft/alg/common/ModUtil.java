package com.doubleysoft.alg.common;

public class ModUtil {
    /**
     * 求a的k次方并且对base求模。
     * (a * b) % k = (a % k)(b % k) % k
     *
     * @param a
     * @param k
     * @param base
     * @return
     */
    public static int powAndMod(int a, int k, int base) {
        a = a % base;
        int res = 1;
        for (int i = 0; i < k; i++) {
            res = res * a;
            res = res % base;
        }
        return res;
    }
}
