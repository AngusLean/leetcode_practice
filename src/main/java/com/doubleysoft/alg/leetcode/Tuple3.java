package com.doubleysoft.alg.leetcode;

/**
 * @author cupofish@gmail.com
 * 9/8/19 16:45
 */
public class Tuple3<K, V, R> extends Tuple<K, V> {
    private R r;

    public Tuple3(K k, V v, R r) {
        super(k, v);
        this.r = r;
    }

    public R getThird() {
        return r;
    }
}
