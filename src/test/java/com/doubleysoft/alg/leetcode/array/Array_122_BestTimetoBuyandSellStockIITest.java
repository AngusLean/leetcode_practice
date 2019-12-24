package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.CommonUtil;
import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Array_122_BestTimetoBuyandSellStockIITest {
    public List<Tuple<List<Integer>, Integer>> testData;
    private Array_122_BestTimetoBuyandSellStockII array_122_bestTimetoBuyandSellStockII;

    @Before
    public void setUp() throws Exception {
        array_122_bestTimetoBuyandSellStockII = new Array_122_BestTimetoBuyandSellStockII();
        testData = Arrays.asList(
                new Tuple<>(Arrays.asList(7, 1, 5, 3, 6, 4), 7),
                new Tuple<>(Arrays.asList(1, 2, 3, 4, 5), 4),
                new Tuple<>(Arrays.asList(2, 1, 4, 5, 2, 9, 7), 11),
                new Tuple<>(Arrays.asList(5, 4, 3, 2, 1), 0)
        );
    }

    @Test
    public void maxProfit() {
        testData.forEach(tuple -> {
            int result = array_122_bestTimetoBuyandSellStockII.maxProfit(CommonUtil.integerArr2IntArr(tuple.getFirst().toArray(new Integer[]{0})));
            Assert.assertTrue(tuple.getSecound() == result);
        });
    }
}