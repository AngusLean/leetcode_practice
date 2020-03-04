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
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (k != null) {
            sb.append(k.toString());
        } else {
            sb.append("null");
        }
        sb.append(", ");
        if (v != null) {
            sb.append(v.toString());
        } else {
            sb.append("null");
        }
        sb.append("]");
        return sb.toString();
    }
}
