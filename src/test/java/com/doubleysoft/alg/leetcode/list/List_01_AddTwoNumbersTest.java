package com.doubleysoft.alg.leetcode.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
public class List_01_AddTwoNumbersTest {
    private static List<List<List_01_AddTwoNumbers.ListNode>> testDatas;

    static {
        testDatas = new ArrayList<List<List_01_AddTwoNumbers.ListNode>>() {{
            add(new ArrayList<List_01_AddTwoNumbers.ListNode>() {{
                add(getListNode(new int[]{2, 4, 3}));
                add(getListNode(new int[]{5, 6, 4}));
                add(getListNode(new int[]{7, 0, 8}));
            }});
            add(new ArrayList<List_01_AddTwoNumbers.ListNode>() {{
                add(getListNode(new int[]{2, 4, 3}));
                add(getListNode(new int[]{8}));
                add(getListNode(new int[]{0, 5, 3}));
            }});
            add(new ArrayList<List_01_AddTwoNumbers.ListNode>() {{
                add(getListNode(new int[]{2, 4, 3}));
                add(getListNode(new int[]{5, 6, 6}));
                add(getListNode(new int[]{7, 0, 0, 1}));
            }});
        }};
    }

    private static List_01_AddTwoNumbers.ListNode getListNode(int[] arr) {
        List_01_AddTwoNumbers.ListNode listNode = new List_01_AddTwoNumbers.ListNode(arr[0]);
        List_01_AddTwoNumbers.ListNode tempPtr = listNode;
        for (int i = 1; i < arr.length; i++) {
            List_01_AddTwoNumbers.ListNode temp = new List_01_AddTwoNumbers.ListNode(arr[i]);
            tempPtr.next = temp;
            tempPtr = tempPtr.next;
        }
        return listNode;
    }

    @Test
    public void addTwoNumbers() {
        testDatas.forEach(row -> {
            List_01_AddTwoNumbers.ListNode result = List_01_AddTwoNumbers.addTwoNumbers(row.get(0), row.get(1));
            List_01_AddTwoNumbers.ListNode target = row.get(2);
            while (target != null) {
                Assert.assertEquals(target.val, result.val);
                target = target.next;
                result = result.next;
            }
        });
    }
}