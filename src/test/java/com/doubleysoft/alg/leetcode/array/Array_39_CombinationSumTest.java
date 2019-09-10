package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.CommonUtil;
import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author cupofish@gmail.com
 * 9/10/19 22:48
 */
public class Array_39_CombinationSumTest {
    private static List<Tuple3<int[], Integer, List<List<Integer>>>> testDatas = new ArrayList<Tuple3<int[], Integer, List<List<Integer>>>>() {{
        add(new Tuple3<>(CommonUtil.integerArr2IntArr(new Integer[]{2, 3, 6, 7}), 7,
                new ArrayList<List<Integer>>() {{
                    Arrays.asList(7);
                    Arrays.asList(2, 2, 3);
                }}
        ));
        add(new Tuple3<>(CommonUtil.integerArr2IntArr(new Integer[]{2, 3, 5}), 8,
                new ArrayList<List<Integer>>() {{
                    Arrays.asList(2, 2, 2, 2);
                    Arrays.asList(2, 3, 3);
                    Arrays.asList(3, 5);
                }}
        ));
    }};

    @Test
    public void combinationSum() {
        Array_39_CombinationSum array_39_combinationSum = new Array_39_CombinationSum();
        testDatas.forEach(row -> {
            List<List<Integer>> lists = array_39_combinationSum.combinationSum(row.getFirst(), row.getSecound());
            CommonUtil.testListEqualNoOrders(row.getThird(), lists, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });
        });
    }
}