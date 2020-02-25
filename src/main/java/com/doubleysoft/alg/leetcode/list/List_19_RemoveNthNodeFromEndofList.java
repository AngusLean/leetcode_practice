package com.doubleysoft.alg.leetcode.list;

import com.doubleysoft.alg.ListNode;

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * <p>
 * Example:
 * <p>
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 * <p>
 * Given n will always be valid.
 *
 * @see <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">19. Remove Nth Node From End of List</a>
 * <p>
 * 这道题的关键其实是移除“头部”的节点的处理逻辑，所以这个算法引入了一个头部之前的节点来处理
 */
public class List_19_RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode left = prev, right = prev;
        int i = 0;
        //在确定n是有效的情况下（没有过界）
        while (i <= n) {
            right = right.next;
            i++;
        }
        while (right != null) {
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return prev.next;
    }
}
