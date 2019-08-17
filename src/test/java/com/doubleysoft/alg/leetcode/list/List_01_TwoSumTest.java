package com.doubleysoft.alg.leetcode.list;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
public class List_01_TwoSumTest {

    @Test
    public void twoSum() {
        int[] arr = new int[]{2, 7, 11, 15};
        int val = 9;
        int[] target = new int[]{0, 1};
        Assert.assertArrayEquals(target, List_01_TwoSum.twoSum(arr, val));
    }
}