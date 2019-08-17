package com.doubleysoft.alg.leetcode.array;

import lombok.Builder;
import lombok.Getter;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
public class Array_11_ContainerWithMostWaterTest {
    private static List<Array_11_ContainerWithMostWaterTestData> testData = new ArrayList<Array_11_ContainerWithMostWaterTestData>() {{
        add(Array_11_ContainerWithMostWaterTestData.builder()
                .arr(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})
                .target(49)
                .build());
        add(Array_11_ContainerWithMostWaterTestData.builder()
                .arr(new int[]{0, 1})
                .target(0)
                .build());
        add(Array_11_ContainerWithMostWaterTestData.builder()
                .arr(new int[]{1, 1, 1, 1, 1})
                .target(4)
                .build());
        add(Array_11_ContainerWithMostWaterTestData.builder()
                .arr(new int[]{5, 5, 5, 5})
                .target(15)
                .build());
    }};

    @Test
    public void maxArea() {
        testData.forEach(row -> {
            Assert.assertEquals(row.getTarget(), Array_11_ContainerWithMostWater.maxArea(row.getArr()));
        });
    }

    @Builder
    @Getter
    public static class Array_11_ContainerWithMostWaterTestData {
        int target;
        private int[] arr;
    }
}