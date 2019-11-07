package com.doubleysoft.alg.leetcode.list;

/**
 * @see <a href="https://leetcode.com/problems/intersection-of-two-linked-lists/">160. Intersection of Two Linked Lists</a>
 */
public class List_160_IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        if (sizeOfList(headA) > sizeOfList(headB)) {
            return getIntersectionNode(headB, headA);
        }
        int len1 = sizeOfList(headA);
        int len2 = sizeOfList(headB);
        ListNode tmp1 = headA;
        ListNode tmp2 = headB;
        for (int i = 0; i < len2 - len1; i++) {
            tmp2 = tmp2.next;
        }
        while (tmp1 != null || tmp2 != null) {
            if (tmp1 == tmp2) {
                return tmp1;
            }
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }
        return null;
    }

    private int sizeOfList(ListNode node) {
        int len = 0;
        while ((node = node.next) != null) {
            len++;
        }
        return len;
    }
}
