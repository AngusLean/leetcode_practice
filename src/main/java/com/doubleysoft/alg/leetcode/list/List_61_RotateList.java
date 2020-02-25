package com.doubleysoft.alg.leetcode.list;

import com.doubleysoft.alg.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/rotate-list/">61. Rotate List</a></a>
 */
public class List_61_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0) {
            return head;
        }
        int len = lenOfList(head);
        if (len <= 1) {
            return head;
        }
        int newStep = k % len;
        if (newStep == 0) {
            return head;
        }
        int left = len - newStep;
        ListNode tmp = head, newHead = null;
        int i = 1;
        while (i < left) {
            tmp = tmp.next;
            i++;
        }
        ListNode rotatePoint = tmp;
        newHead = tmp.next;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = head;
        //特别注意这里的尾指针赋为空不能提前
        rotatePoint.next = null;
        return newHead;
    }

    private int lenOfList(ListNode head) {
        ListNode tmp = head;
        int len = 0;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        return len;
    }
}
