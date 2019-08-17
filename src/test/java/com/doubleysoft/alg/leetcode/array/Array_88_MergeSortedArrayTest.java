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
public class Array_88_MergeSortedArrayTest {
    private static List<Array_88_MergeSortedArrayData> dataList;

    static {
        dataList = new ArrayList<Array_88_MergeSortedArrayData>() {{
            add(Array_88_MergeSortedArrayData.builder()
                    .nums1(new int[]{1, 2, 3, 0, 0, 0})
                    .m(3)
                    .nums2(new int[]{2, 5, 6})
                    .n(3)
                    .target(new int[]{1, 2, 2, 3, 5, 6})
                    .build());
            add(Array_88_MergeSortedArrayData.builder()
                    .nums1(new int[]{1, 2, 3, 0})
                    .m(3)
                    .nums2(new int[]{0})
                    .n(1)
                    .target(new int[]{0, 1, 2, 3})
                    .build());
            add(Array_88_MergeSortedArrayData.builder()
                    .nums1(new int[]{1, 0, 0, 0, 0})
                    .m(1)
                    .nums2(new int[]{1, 2, 3, 4})
                    .n(4)
                    .target(new int[]{1, 1, 2, 3, 4})
                    .build());
        }};
    }

    @Test
    public void merge() {
        dataList.forEach(row -> {
            Array_88_MergeSortedArray.merge(row.getNums1(), row.getM(), row.getNums2(), row.getN());
            Assert.assertArrayEquals(row.getNums1(), row.getTarget());
        });
    }

    @Builder
    @Getter
    static class Array_88_MergeSortedArrayData {
        int[] nums1;
        int m;
        int[] nums2;
        int n;

        int[] target;
    }

}