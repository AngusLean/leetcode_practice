package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_15_3SumTest {

    //    private Tuple<List<Integer>, List<List<Integer>>> data = new Tuple<>(Arrays.asList(-1, 0, 1, 2, -1, -4), new ArrayList<List<Integer>>(){{
//        add(Arrays.asList(-1, 0, 1));
//        add(Arrays.asList(-1, -1, 2));
//    }});
    private Tuple<List<Integer>, List<List<Integer>>> data = new Tuple<>(Arrays.asList(-1, 0, 1), new ArrayList<List<Integer>>() {{
        add(Arrays.asList(-1, 0, 1));
    }});

    @Test
    public void threeSum() {
        int[] arr = new int[data.getFirst().size()];

        Integer[] objects = data.getFirst().toArray(new Integer[0]);
        int       i       = 0;
        for (Integer obj : objects) {
            arr[i++] = obj.intValue();
        }
        List<List<Integer>> lists = Array_15_3Sum.threeSum(arr);

        //System.out.println(lists);
    }
}