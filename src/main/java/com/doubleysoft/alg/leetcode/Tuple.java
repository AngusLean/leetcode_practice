package com.doubleysoft.alg.leetcode;

/**
 * @author cupofish@gmail.com
 * 9/7/19 18:05
 */
public class Tuple<K, V> {
    protected K k;
    protected V v;

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

    @Override
    public String toString() {
        return "[" + k == null ? "null" : k.toString() + ", " + v == null ? "null" : v.toString() + "]";
    }
}
