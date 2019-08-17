package com.doubleysoft.alg.leetcode.list;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">2. Add Two Numbers</a>
 */
public class List_01_AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            throw new NullPointerException();
        }
        if (l1.val == 0 && l1.next == null) {
            return l2;
        } else if (l2.val == 0 && l2.next == null) {
            return l1;
        }
        boolean hasNext = false;
        ListNode tempPtr = null;
        ListNode result = null;
        while (true) {
            int crt = 0;
            if (l1 == null && l2 == null) {
                //最后一位进1
                if (hasNext) {
                    ListNode temp = new ListNode(1);
                    tempPtr.next = temp;
                    tempPtr = tempPtr.next;
                }
                break;
            }
            if (hasNext) {
                crt += 1;
            }
            if (l1 != null) {
                crt += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                crt += l2.val;
                l2 = l2.next;
            }
            if (crt >= 10) {
                crt = crt - 10;
                hasNext = true;
            } else {
                hasNext = false;
            }

            ListNode temp = new ListNode(crt);
            if (tempPtr == null) {
                tempPtr = temp;
                result = tempPtr;
            } else {
                tempPtr.next = temp;
                tempPtr = tempPtr.next;
            }
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
