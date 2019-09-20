package com.doubleysoft.alg.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 * @see <a href="https://leetcode.com/problems/pascals-triangle/">118. Pascal's Triangle</a>
 */
public class Array_118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resut = new ArrayList<>();
        if (numRows == 0) {
            return resut;
        } else if (numRows == 1) {
            resut.add(Arrays.asList(1));
            return resut;
        }
        resut.add(Arrays.asList(1));
        for (int i = 2; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 2; j < i; j++) {
                temp.add(resut.get(i - 2).get(j - 2) + resut.get(i - 2).get(j - 1));
            }
            temp.add(1);
            resut.add(temp);
        }
        return resut;
    }
}
