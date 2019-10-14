package com.doubleysoft.alg.leetcode.array;

import lombok.Builder;
import lombok.Data;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
public class Array_35_SearchInsertPositionTest {
    private static List<SearchInsertPositionTestData> testData;

    static {
        testData = new ArrayList<SearchInsertPositionTestData>() {{
            add(SearchInsertPositionTestData.builder()
                    .arr(new int[]{1, 3, 5, 6})
                    .target(5)
                    .answer(2)
                    .build());
            add(SearchInsertPositionTestData.builder()
                    .arr(new int[]{1, 3, 5, 6})
                    .target(2)
                    .answer(1)
                    .build());
            add(SearchInsertPositionTestData.builder()
                    .arr(new int[]{1, 3, 5, 6})
                    .target(7)
                    .answer(4)
                    .build());
            add(SearchInsertPositionTestData.builder()
                    .arr(new int[]{1, 3, 5, 6})
                    .target(0)
                    .answer(0)
                    .build());
            add(SearchInsertPositionTestData.builder()
                    .arr(new int[]{1})
                    .target(0)
                    .answer(0)
                    .build());
            add(SearchInsertPositionTestData.builder()
                    .arr(new int[]{1})
                    .target(2)
                    .answer(1)
                    .build());
        }};
    }

    @Test
    public void searchInsert() {
        testData.forEach(row -> {
            Assert.assertEquals(Array_35_SearchInsertPosition.searchInsert(row.getArr(), row.getTarget()), row.getAnswer());
        });
    }

    @Data
    @Builder
    static class SearchInsertPositionTestData {
        private int[] arr;

        private int target;

        private int answer;
    }
}