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
        sb.append(", ");
        if (r != null) {
            sb.append(r.toString());
        } else {
            sb.append("null");
        }
        sb.append("]");
        return sb.toString();
    }
}
