package com.doubleysoft.alg.leetcode.array;

/**
 * Given an array of integers arr.
 * <p>
 * We want to select three indices i, j and k where (0 <= i < j <= k < arr.length).
 * <p>
 * Let's define a and b as follows:
 * <p>
 * a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
 * b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
 * Note that ^ denotes the bitwise-xor operation.
 * <p>
 * Return the number of triplets (i, j and k) Where a == b.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [2,3,1,6,7]
 * Output: 4
 * Explanation: The triplets are (0,1,2), (0,2,2), (2,3,4) and (2,4,4)
 * Example 2:
 * <p>
 * Input: arr = [1,1,1,1,1]
 * Output: 10
 *
 * @see <a href="https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/">1442. Count Triplets That Can Form Two Arrays of Equal XOR</a>
 */
public class Array_1442_CountTripletsXOR {
    //O n*3, 空间O1
    public int countTriplets(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int left = xorSum(arr, i, j - 1);
                for (int k = j; k < arr.length; k++) {
                    int right = xorSum(arr, j, k);
                    if (left == right) {
                        num++;
                    }
                }
            }
        }
        return num;
    }

    /**
     * 题目可以等价为arr[i] ^ arr[i + 1] ^ ... ^ arr[k] = 0
     * 由于j和k可以相同，所以我们可以只需要取一个数就行了。
     * 从数组的左边(i)向右(j)依次亦或，如果当前异或值为0,则这里可以取j-i对数字。
     * 时间复杂度N*2, 空间O1
     */
    public int countTriplets1(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int xor = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                xor ^= arr[j];
                if (xor == 0) {
                    num += j - i;
                }
            }
        }
        return num;
    }

    private int xorSum(int[] arr, int begin, int end) {
        int result = 0;
        for (int i = begin; i <= end; i++) {
            result ^= arr[i];
        }
        return result;
    }
}
