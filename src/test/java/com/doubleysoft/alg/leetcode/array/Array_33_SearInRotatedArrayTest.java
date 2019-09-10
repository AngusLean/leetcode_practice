package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.CommonUtil;
import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cupofish@gmail.com
 * 9/8/19 16:44
 */
public class Array_33_SearInRotatedArrayTest {
    private static List<Tuple3<List<Integer>, Integer, Integer>> testDatas = new ArrayList<Tuple3<List<Integer>, Integer, Integer>>() {{
        add(new Tuple3<>(Arrays.asList(4, 5, 1), 2, -1));
        add(new Tuple3<>(Arrays.asList(4, 5, 1), 1, 2));
        add(new Tuple3<>(Arrays.asList(4, 5, 1), 4, 0));
        add(new Tuple3<>(Arrays.asList(4, 5, 1, 2), 2, 3));
        add(new Tuple3<>(Arrays.asList(4, 5, 6, 7, 2), 3, -1));
        add(new Tuple3<>(Arrays.asList(4, 5, 6, 7, 2), 7, 3));
        add(new Tuple3<>(Arrays.asList(8, 1, 2, 3), 3, 3));
        add(new Tuple3<>(Arrays.asList(5, 1, 3), 5, 0));
        add(new Tuple3<>(Arrays.asList(1, 0), 1, 0));
        add(new Tuple3<>(Arrays.asList(1, 0), 0, 1));
        add(new Tuple3<>(Arrays.asList(), 0, -1));
    }};

    @Test
    public void search() {
        Array_33_SearInRotatedArray array_33_searInRotatedArray = new Array_33_SearInRotatedArray();
        testDatas.forEach(row -> {
            int search = array_33_searInRotatedArray.search(CommonUtil.integerArr2IntArr(row.getFirst().toArray(new Integer[0])), row.getSecound().intValue());
            Assert.assertEquals(row.getThird().intValue(), search);
        });
    }
}