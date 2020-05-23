package com.doubleysoft.alg.leetcode.list;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class List_70_ClimbingStairsTest {
    private List<Tuple<Integer, Integer>> testData;

    private List_70_ClimbingStairs list_70_climbingStairs;


    @Before
    public void setUp() throws Exception {
        list_70_climbingStairs = new List_70_ClimbingStairs();
        testData = new ArrayList<Tuple<Integer, Integer>>() {{
            add(new Tuple<>(2, 2));
            add(new Tuple<>(3, 3));
            add(new Tuple<>(1, 1));
            add(new Tuple<>(45, 1836311903));
        }};
    }

    @Test
    public void climbStairs() {
        testData.forEach(row -> {
            //System.out.println("test row: " + row);
            int rs = list_70_climbingStairs.climbStairs(row.getFirst());
            Assert.assertTrue(row.getSecound() == rs);
        });
    }
}