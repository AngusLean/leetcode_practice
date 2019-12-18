package com.doubleysoft.alg.leetcode;

/**
 * @author cupofish@gmail.com
 * 9/7/19 18:05
 */
public class Tuple<K, V> {
    private K k;
    private V v;

    public Tuple(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getFirst() {
        return k;
    }

    public V getSecound() {
        return v;
    }


}
