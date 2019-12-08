package com.doubleysoft.alg.leetcode.list;

import org.junit.Test;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
public class List_234_PalindromeListTest {
    private static ListNode data = null;

    static {

//        int[] arr = new int[]{1,2,2,1};
//        int[] arr = new int[]{1, 2, 2, 1};
//        int[] arr = new int[]{-100, 2, 2, -100};
        int[] arr = new int[]{1, -129};
        ListNode temp = null;
        for (int num : arr) {
            if (temp == null) {
                temp = new ListNode(num);
                data = temp;
            } else {
                temp.next = new ListNode(num);
                temp = temp.next;
            }
        }
    }

    @Test
    public void isPalindrome() {
        System.out.println(Math.pow(2, 16));

    }
}