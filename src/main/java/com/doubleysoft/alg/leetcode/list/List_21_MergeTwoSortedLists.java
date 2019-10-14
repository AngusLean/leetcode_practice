package com.doubleysoft.alg.leetcode.list;

/**
 * @see <a href="https://leetcode.com/problems/merge-two-sorted-lists/">21. Merge Two Sorted Lists</a>
 * this solution is most-directly, no recursion
 */
public class List_21_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = null, tmp = null;
        ListNode left = l1, right = l2;
        while (left != null) {
            if (right == null) {
                while (left != null) {
                    tmp.next = new ListNode(left.val);
                    tmp = tmp.next;
                    left = left.next;
                }
                return result;
            }
            if (left.val < right.val) {
                if (result == null) {
                    result = new ListNode(left.val);
                    tmp = result;
                } else {
                    tmp.next = new ListNode(left.val);
                    tmp = tmp.next;
                }
                left = left.next;
            } else {
                if (result == null) {
                    result = new ListNode(right.val);
                    tmp = result;
                } else {
                    tmp.next = new ListNode(right.val);
                    //特别注意这里指针下移不能放在外层，因为可能tmp才初始化
                    tmp = tmp.next;
                }
                right = right.next;
            }

        }
        if (right != null) {
            while (right != null) {
                tmp.next = new ListNode(right.val);
                tmp = tmp.next;
                right = right.next;
            }
            return result;
        }
        return result;
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result;
        if (l1.val < l2.val) {
            result = l1;
            l1.next = mergeTwoLists1(l1.next, l2);
        } else {
            result = l2;
            l2.next = mergeTwoLists1(l1, l2.next);
        }
        return result;
    }

}
