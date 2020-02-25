package com.doubleysoft.alg.leetcode.list;

import com.doubleysoft.alg.ListNode;

/**
 * 203. Remove Linked List Elements
 * Remove all elements from a linked list of integers that have value val.
 * <p>
 * Example:
 * <p>
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 *
 *
 * @see <a href="https://leetcode.com/problems/remove-linked-list-elements/">203. Remove Linked List Elements</a>
 */
public class List_203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode tmp = head;
        ListNode newHead = head;
        if (tmp.val == val) {
            while (tmp != null && tmp.val == val) {
                tmp = tmp.next;
            }
            newHead = tmp;
        }
        if (newHead == null) {
            return newHead;
        }
        tmp = newHead;
        while (tmp != null) {
            while ((tmp.next != null && tmp.next.val == val)) {
                tmp.next = tmp.next.next;
            }
            tmp = tmp.next;
        }
        return newHead;
    }
}
