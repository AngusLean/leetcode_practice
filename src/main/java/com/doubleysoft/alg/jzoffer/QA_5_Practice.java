package com.doubleysoft.alg.jzoffer;

/**
 * 有两个排序的数组A1和A2，内存在A1的末尾有足够多的空余空间容纳A2。请实现一个函数，把A2中的所有数字插入A1中，并且所有数字是排序的。
 */
public class QA_5_Practice {
    public static int[] insertSortedArr(int[] left, int leftNum, int[] right) {
        int len1 = left.length, len2 = right.length;
        if (len2 == 0) {
            return left;
        }
        int leftIndex = leftNum - 1, rightIndex = len2 - 1;
        int idx = len1 - 1;
        while (rightIndex >= 0) {
            //左边最后一个数字大于右边最后一个数字.特别注意这里要判断等于，不然的话左边数组最左的数字和右边最左相同的时候不好处理
            if (leftIndex >= 0 && left[leftIndex] >= right[rightIndex]) {
                left[idx--] = left[leftIndex];
                leftIndex--;
            } else {
                left[idx--] = right[rightIndex];
                rightIndex--;
            }
        }
        return left;
    }
}
