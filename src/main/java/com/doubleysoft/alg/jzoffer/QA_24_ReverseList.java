package com.doubleysoft.alg.jzoffer;

import com.doubleysoft.alg.ListNode;

public class QA_24_ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode tmp = head;
        ListNode prev = null;
        while (tmp != null) {
            ListNode next = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = next;
        }
        return prev;
    }
}
