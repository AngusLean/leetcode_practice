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
public class Array_53_MaximumSubarrayTest {
    private static List<Array_53_MaximumSubarrayTestData> testData;

    static {
        testData = new ArrayList<Array_53_MaximumSubarrayTestData>() {{
            add(Array_53_MaximumSubarrayTestData.builder()
                    .arr(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})
                    .answer(6)
                    .build());
            add(Array_53_MaximumSubarrayTestData.builder()
                    .arr(new int[]{1, 2, 3, 4, -1, 5})
                    .answer(14)
                    .build());
        }};
    }

    @Test
    public void maxSubArray() {
        testData.forEach(row -> Assert.assertEquals(row.getAnswer(), Array_53_MaximumSubarray.maxSubArray(row.getArr())));
    }

    @Builder
    @Getter
    static class Array_53_MaximumSubarrayTestData {
        private int[] arr;
        private int answer;
    }
}