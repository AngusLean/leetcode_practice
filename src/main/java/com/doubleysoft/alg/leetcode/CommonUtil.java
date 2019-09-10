package com.doubleysoft.alg.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author cupofish@gmail.com
 * 9/7/19 18:18
 */
public class CommonUtil {
    public static Integer[] intArr2IntegerArr(int[] arr) {
        return Arrays.stream(arr).boxed().toArray(Integer[]::new);
    }

    public static int[] integerArr2IntArr(Integer[] arr) {
        int[] result = new int[arr.length];
        int   i      = 0;
        for (Integer integer : arr) {
            result[i++] = integer.intValue();
        }
        return result;
    }

    public static <T> void testListEqualNoOrders(List<List<T>> data1, List<List<T>> data2, Comparator<T> comparator) {
        for (List<T> t1 : data1) {
            boolean notEqual = false;
            for (T t2 : t1) {
                for (List<T> d1 : data2) {
                    for (T d2 : d1) {
                        if (comparator.compare(t2, d2) != 0) {
                            notEqual = true;
                            break;
                        }
                    }
                    if (notEqual) {
                        break;
                    }
                }
            }
            if (notEqual) {
                throw new RuntimeException("list don't equal");
            }
        }
    }
}
