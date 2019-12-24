package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.CommonUtil;
import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Array_121_BestTimetoBuyandSellStockTest {
    public List<Tuple<List<Integer>, Integer>> testData;
    private Array_121_BestTimetoBuyandSellStock array_121_bestTimetoBuyandSellStock;

    @Before
    public void setUp() throws Exception {
        array_121_bestTimetoBuyandSellStock = new Array_121_BestTimetoBuyandSellStock();
        testData = Arrays.asList(
                new Tuple<>(Arrays.asList(7, 1, 5, 3, 6, 4), 5),
                new Tuple<>(Arrays.asList(5, 4, 3, 2, 1), 0)
        );
    }

    @Test
    public void maxProfit() {
        testData.forEach(tuple -> {
            int result = array_121_bestTimetoBuyandSellStock.maxProfit(CommonUtil.integerArr2IntArr(tuple.getFirst().toArray(new Integer[]{0})));
            Assert.assertTrue(tuple.getSecound() == result);
        });
    }
}