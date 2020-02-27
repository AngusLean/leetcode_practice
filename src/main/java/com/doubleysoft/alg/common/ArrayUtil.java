package com.doubleysoft.alg.common;

public class ArrayUtil {
    public static int partition(int[] arr, int start, int end) {
        int index = (start + end) / 2;
        swap(arr, index, end);
        int small = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < arr[end]) {
                if (small != i) {
                    swap(arr, small, i);
                }
                small++;
            }
        }
        swap(arr, small, end);
        return small;
    }

    public static void swap(int[] arr, int begin, int end) {
        int tmp = arr[begin];
        arr[begin] = arr[end];
        arr[end] = tmp;
    }
}
