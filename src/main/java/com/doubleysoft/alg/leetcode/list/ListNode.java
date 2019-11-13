package com.doubleysoft.alg.leetcode.list;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    public static ListNode build(int... values) {
        ListNode head = null;
        ListNode tmp = null;
        for (int val : values) {
            if (head == null) {
                head = new ListNode(val);
                tmp = head;
            } else {
                tmp.next = new ListNode(val);
                tmp = tmp.next;
            }
        }
        return head;
    }
}
