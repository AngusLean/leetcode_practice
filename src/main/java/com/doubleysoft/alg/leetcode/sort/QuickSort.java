package com.doubleysoft.alg.leetcode.sort;

import java.util.Random;

import static com.doubleysoft.alg.leetcode.CommonUtil.swap;

public class QuickSort implements Sort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        System.out.println(quickSort.randomSelect(1, 5));
        System.out.println(quickSort.randomSelect(1, 5));
        System.out.println(quickSort.randomSelect(1, 5));
        System.out.println(quickSort.randomSelect(1, 5));
        System.out.println(quickSort.randomSelect(1, 5));
    }

    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private int partition(int[] arr, int start, int end) {
        if (start >= end) {
            return start;
        }
        int part = (end + start) / 2;
        int small = start;
        swap(arr, part, end);
        for (int i = start; i < end; i++) {
            if (arr[i] < arr[end]) {
                swap(arr, i, small);
                small++;
            }
        }
        swap(arr, small, end);
        return small;
    }

    private void quickSort(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }
        int partition = partition(arr, start, end);
        if (partition > start) {
            quickSort(arr, start, partition - 1);
        }
        if (partition < end) {
            quickSort(arr, partition + 1, end);
        }
    }

    private int randomSelect(int begin, int end) {
        return begin + new Random().nextInt() % (end - begin);
    }
}
