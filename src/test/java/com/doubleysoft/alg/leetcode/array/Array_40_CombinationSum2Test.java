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
 * 9/11/19 22:01
 */
public class Array_40_CombinationSum2Test {

    private static List<Tuple3<int[], Integer, List<List<Integer>>>> testDatas = new ArrayList<Tuple3<int[], Integer, List<List<Integer>>>>() {{
        add(new Tuple3<>(CommonUtil.integerArr2IntArr(new Integer[]{2, 3, 6, 7}), 7,
                new ArrayList<List<Integer>>() {{
                    Arrays.asList(7);
                }}
        ));
        add(new Tuple3<>(CommonUtil.integerArr2IntArr(new Integer[]{2, 3, 5}), 8,
                new ArrayList<List<Integer>>() {{
                    Arrays.asList(3, 5);
                }}
        ));
        add(new Tuple3<>(CommonUtil.integerArr2IntArr(new Integer[]{10, 1, 2, 7, 6, 1, 5}), 8,
                new ArrayList<List<Integer>>() {{
                    Arrays.asList(1, 7);
                    Arrays.asList(1, 2, 5);
                    Arrays.asList(2, 6);
                    Arrays.asList(1, 1, 6);
                }}
        ));
        add(new Tuple3<>(CommonUtil.integerArr2IntArr(new Integer[]{2, 5, 2, 1, 2}), 5,
                new ArrayList<List<Integer>>() {{
                    Arrays.asList(1, 2, 2);
                    Arrays.asList(5);
                }}
        ));
    }};

    @Test
    public void combinationSum() {
        Array_40_CombinationSum2 array_39_combinationSum = new Array_40_CombinationSum2();
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