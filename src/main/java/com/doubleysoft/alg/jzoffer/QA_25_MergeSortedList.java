package com.doubleysoft.alg.jzoffer;

import com.doubleysoft.alg.ListNode;

public class QA_25_MergeSortedList {
    public ListNode mergeSortedList(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }
        ListNode result = null;
        if (head1.val < head2.val) {
            result = head1;
            result.next = mergeSortedList(head1.next, head2);
        } else {
            result = head2;
            result.next = mergeSortedList(head1, head2.next);
        }
        return result;
    }
}

