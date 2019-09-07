package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.CommonUtil;
import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cupofish@gmail.com
 * 9/7/19 19:05
 */
public class Array_16_3SumClosestTest {
//    private Tuple<Tuple<List<Integer>, Integer>, Integer> data = new Tuple<>(new Tuple<>(Arrays.asList(-1, 2, 1, -4), 1), 2);

    private List<Tuple<Tuple<List<Integer>, Integer>, Integer>> datas = new ArrayList<Tuple<Tuple<List<Integer>, Integer>, Integer>>() {{
        add(new Tuple<>(new Tuple<>(Arrays.asList(-1, 2, 1, -4), 1), 2));
        add(new Tuple<>(new Tuple<>(Arrays.asList(-1, 2, 1, -4), -4), -4));
        add(new Tuple<>(new Tuple<>(Arrays.asList(-1, 0, 3, 8), 0), 0));
    }};

    @Test
    public void threeSumClosest() {
        datas.forEach(data -> {
            int val = Array_16_3SumClosest.threeSumClosest(CommonUtil.integerArr2IntArr(data.getFirst().getFirst().toArray(new Integer[0])),
                    data.getFirst().getSecound());
            Assert.assertEquals(val, data.getSecound().intValue());
        });

    }
}