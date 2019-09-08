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
 * 9/8/19 13:13
 */
public class Array_31_NextPermutationTest {
    private static List<Tuple<List<Integer>, List<Integer>>> testDatas = new ArrayList<Tuple<List<Integer>, List<Integer>>>() {{
        add(new Tuple<>(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2)));
        add(new Tuple<>(Arrays.asList(3, 2, 1), Arrays.asList(1, 2, 3)));
        add(new Tuple<>(Arrays.asList(1, 1, 5), Arrays.asList(1, 5, 1)));
        add(new Tuple<>(Arrays.asList(1, 3, 2), Arrays.asList(2, 1, 3)));
        add(new Tuple<>(Arrays.asList(1, 5, 8, 4, 7, 6, 5, 3, 1), Arrays.asList(1, 5, 8, 5, 1, 3, 4, 6, 7)));
    }};

    @Test
    public void nextPermutation() {
        Array_31_NextPermutation array_31_nextPermutation = new Array_31_NextPermutation();
        testDatas.forEach(row -> {
            int[] nums   = CommonUtil.integerArr2IntArr(row.getFirst().toArray(new Integer[0]));
            int[] target = CommonUtil.integerArr2IntArr(row.getSecound().toArray(new Integer[0]));
            array_31_nextPermutation.nextPermutation(nums);
            Assert.assertArrayEquals(nums, target);
        });
    }
}