package com.doubleysoft.alg.leetcode.list;

/**
 * @see <a href="https://leetcode.com/problems/reverse-linked-list/">206. Reverse Linked List</a>
 */
public class List_206_ReverseLinkedList {
    /**
     * 注意指针操作不要漏掉
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null, prev = null;
        ListNode tmp = head;
        while (tmp != null) {
            if (tmp.next == null) {
                newHead = tmp;
            }
            //先保存下个节点
            ListNode next = tmp.next;
            //然后把当前节点的下个节点置为前一个节点
            tmp.next = prev;
            //设置当前节点为前一个节点，以便于下次循环
            prev = tmp;
            tmp = next;
        }
        return newHead;
    }
}
