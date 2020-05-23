package com.doubleysoft.alg.leetcode.array;

import com.doubleysoft.alg.leetcode.CommonUtil;

import java.util.*;

/**
 * @see <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii/">350. Intersection of Two Arrays II</a>
 */
public class Array_350_IntersectionoTwoArraysII {
    /**
     * 本题愿意是要求出现的一样的数字即可，不要求顺序。所以解法完全不同于下面的
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numberCache = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            numberCache.compute(nums1[i], (key, val) -> {
                return numberCache.getOrDefault(key, 0) + 1;
            });
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (numberCache.containsKey(nums2[i]) && numberCache.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                numberCache.put(nums2[i], numberCache.get(nums2[i]) - 1);
            }
        }
        return CommonUtil.integerArr2IntArr(result.toArray(new Integer[]{}));
    }

    /**
     * 如果要求严格的顺序相同，则是下面的解法
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect1(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        //只是求第2个数组在第一个数组的共同子数组，所以没必要考虑大小数组的问题
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (nums1[i] == nums2[j]) {
                    int k = j;
                    for (k = j; k < len2 && i + k - j < len1; k++) {
                        if (nums1[i + k - j] != nums2[k]) {
                            return Arrays.copyOfRange(nums2, j, k);
                        }
                    }
                    return Arrays.copyOfRange(nums2, j, k);
                }
            }
        }

        return new int[]{};
    }

}
