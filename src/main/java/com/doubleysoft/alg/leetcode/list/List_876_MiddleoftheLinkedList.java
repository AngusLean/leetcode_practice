package com.doubleysoft.alg.leetcode.list;

import com.doubleysoft.alg.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/middle-of-the-linked-list/">876. Middle of the Linked List</a>
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5]
 * Output: Node 3 from this list (Serialization: [3,4,5])
 * The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
 * Note that we returned a ListNode object ans, such that:
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 * Example 2:
 * <p>
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list (Serialization: [4,5,6])
 * Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
public class List_876_MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        int len = lenOfNode(head);
        if (len == 0) {
            return null;
        }
        if (len == 1) {
            return head;
        }
        int pos = len / 2 + 1;
        int crtPos = 0;
        ListNode tmp = head;
        while (crtPos < pos - 1) {
            tmp = tmp.next;
            crtPos++;
        }
        return tmp;
    }

    private int lenOfNode(ListNode head) {
        ListNode tmp = head;
        int len = 0;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        return len;
    }
}
