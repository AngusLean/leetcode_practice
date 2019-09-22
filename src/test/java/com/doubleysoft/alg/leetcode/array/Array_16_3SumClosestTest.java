package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.CommonUtil;
import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 */
public class Array_16_3SumClosestTest {

    private List<Tuple<Tuple<List<Integer>, Integer>, Integer>> datas = new ArrayList<Tuple<Tuple<List<Integer>, Integer>, Integer>>() {{
//        add(new Tuple<>(new Tuple<>(Arrays.asList(-1, 2, 1, -4), 1), 2));
//        add(new Tuple<>(new Tuple<>(Arrays.asList(-1, 2, 1, -4), -4), -4));
//        add(new Tuple<>(new Tuple<>(Arrays.asList(-1, 0, 3, 8), 0), 2));
//        add(new Tuple<>(new Tuple<>(Arrays.asList(0, 1, 2), 0), 3));
        add(new Tuple<>(new Tuple<>(Arrays.asList(1, 2, 4, 8, 16, 32, 64, 128), 82), 82));
    }};

    @Test
    public void threeSumClosest() {
        datas.forEach(data -> {
            int val = Array_16_3SumClosest.threeSumClosest(CommonUtil.integerArr2IntArr(data.getFirst().getFirst().toArray(new Integer[0])),
                    data.getFirst().getSecound());
            Assert.assertEquals(data.getSecound().intValue(), val);
        });

        //2sum-closest
//        int i = Array_16_3SumClosest.twoSumClosest(new int[]{4,8,16,32,64,128}, 0, 5, 80);
//        System.out.println(i);
    }
}