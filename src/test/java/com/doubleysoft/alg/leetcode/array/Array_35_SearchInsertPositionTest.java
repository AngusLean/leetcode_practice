package com.doubleysoft.alg.leetcode.array;

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
            add(new SearchInsertPositionTestData(new int[]{1, 3, 5, 6}, 5, 2));
            add(new SearchInsertPositionTestData(new int[]{1, 3, 5, 6}, 2, 1));
            add(new SearchInsertPositionTestData(new int[]{1, 3, 5, 6}, 7, 4));
            add(new SearchInsertPositionTestData(new int[]{1, 3, 5, 6}, 0, 0));
            add(new SearchInsertPositionTestData(new int[]{1}, 0, 0));
            add(new SearchInsertPositionTestData(new int[]{1}, 2, 1));
        }};
    }

    @Test
    public void searchInsert() {
        testData.forEach(row -> {
            Assert.assertEquals(Array_35_SearchInsertPosition.searchInsert(row.getArr(), row.getTarget()), row.getAnswer());
        });
    }

    static class SearchInsertPositionTestData {
        public SearchInsertPositionTestData(int[] arr, int target, int answer) {
            this.arr = arr;
            this.target = target;
            this.answer = answer;
        }

        private int[] arr;

        private int target;

        private int answer;


        public int[] getArr() {
            return arr;
        }

        public int getTarget() {
            return target;
        }

        public int getAnswer() {
            return answer;
        }
    }
}