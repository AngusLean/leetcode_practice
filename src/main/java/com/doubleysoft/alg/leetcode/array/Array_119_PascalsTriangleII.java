package com.doubleysoft.alg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 * <p>
 * Note that the row index starts from 0.
 *
 * @see <a href="https://leetcode.com/problems/pascals-triangle-ii/">119. Pascal's Triangle II</a>
 */
public class Array_119_PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex + 1);
        result.add(1);
        if (rowIndex == 0) {
            return result;
        }
        for (int i = 1; i < rowIndex + 1; i++) {
            List<Integer> prev = new ArrayList<>(rowIndex + 1);
            prev.add(1);
            for (int j = 1; j < i; j++) {
                int above = result.get(j - 1) + result.get(j);
                prev.add(above);
            }
            prev.add(1);
            result = prev;
        }
        return result;
    }
}
