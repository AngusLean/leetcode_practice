package com.doubleysoft.alg.leetcode.list;

/**
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/">83. Remove Duplicates from Sorted List</a>
 */
public class List_83_RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode before = head;
        ListNode tmp = head.next;
        while (tmp != null) {
            if (tmp.val == before.val) {
                before.next = tmp.next;
            } else {
                before = tmp;
            }
            tmp = tmp.next;
        }
        return head;
    }
}
