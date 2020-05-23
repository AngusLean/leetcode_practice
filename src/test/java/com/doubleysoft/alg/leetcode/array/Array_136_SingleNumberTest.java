package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Array_136_SingleNumberTest {
    private List<Tuple<int[], Integer>> testData = new ArrayList<Tuple<int[], Integer>>() {{
        add(new Tuple<>(new int[]{1, 1, 2}, 2));
        add(new Tuple<>(new int[]{1, 2, 2}, 1));
        add(new Tuple<>(new int[]{1, 2, 2, 1, 4, 4, 3, 5, 3, 5, 9}, 9));
    }};

    @Test
    public void singleNumber() {
        testData.forEach(row -> {
            //System.out.println(row);
            int result = Array_136_SingleNumber.singleNumber(row.getFirst());
            Assert.assertEquals(row.getSecound().intValue(), result);
        });
    }

    @Test
    public void dsfs() {
        int a = 3;
        //System.out.println(a & (~a));
        //System.out.println(0 & (~a));
    }
}