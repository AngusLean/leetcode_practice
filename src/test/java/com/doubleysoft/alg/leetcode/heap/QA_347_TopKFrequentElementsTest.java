package com.doubleysoft.alg.leetcode.heap;

import com.doubleysoft.alg.common.ArrayUtilTest;
import com.doubleysoft.alg.leetcode.CommonUtil;
import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QA_347_TopKFrequentElementsTest {
    private List<Tuple3<int[], Integer, int[]>> testData = new ArrayList<Tuple3<int[], Integer, int[]>>() {{
        add(new Tuple3<>(new int[]{1, 1, 1, 2, 2, 3}, 2, new int[]{1, 2}));
        add(new Tuple3<>(new int[]{1, 1, 1, 2, 2, 3, 3, 3}, 2, new int[]{1, 3}));
        add(new Tuple3<>(new int[]{1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4}, 2, new int[]{1, 4}));
        add(new Tuple3<>(new int[]{1}, 1, new int[]{1}));
    }};

    @Test
    public void topKFrequent() {
        testData.forEach(row -> {
            //System.out.println(row);
            List<Integer> result = QA_347_TopKFrequentElements.topKFrequent(row.getFirst(), row.getSecound());
            Integer[] expectArr = CommonUtil.intArr2IntegerArr(row.getThird());
            Integer[] actualResult = result.toArray(new Integer[]{});
            ArrayUtilTest.testIntArrEqual(expectArr, actualResult);
        });
    }

    @Test
    public void topKFrequent1() {
        testData.forEach(row -> {
            //System.out.println(row);
            List<Integer> result = QA_347_TopKFrequentElements.topKFrequent1(row.getFirst(), row.getSecound());
            Integer[] expectArr = CommonUtil.intArr2IntegerArr(row.getThird());
            Integer[] actualResult = result.toArray(new Integer[]{});
            ArrayUtilTest.testIntArrEqual(expectArr, actualResult);
        });
    }
}