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

    public static int[] mergeSortedArr(int[] left, int[] right) {
        if (left.length == 0) {
            return right;
        } else if (right.length == 0) {
            return left;
        }
        int newLen = left.length + right.length;
        int[] result = new int[newLen];
        int leftEnd = left.length - 1, rightEnd = right.length - 1, idx = newLen - 1;
        while (leftEnd >= 0 && rightEnd >= 0) {
            if (left[leftEnd] >= right[rightEnd]) {
                result[idx] = left[leftEnd];
                leftEnd--;
            } else {
                result[idx] = right[rightEnd];
                rightEnd--;
            }
            idx--;
        }
        while (leftEnd >= 0) {
            result[idx--] = left[leftEnd--];
        }
        while (rightEnd >= 0) {
            result[idx--] = right[rightEnd--];
        }
        return result;
    }
}
