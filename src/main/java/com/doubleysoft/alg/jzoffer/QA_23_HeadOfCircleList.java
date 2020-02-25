package com.doubleysoft.alg.jzoffer;

import com.doubleysoft.alg.ListNode;

/**
 * 找到有环链表中的头部节点
 */
public class QA_23_HeadOfCircleList {
    public ListNode entryNodeOfLoop(ListNode head) {
        // 首先找到在环形中的相遇节点
        ListNode meetingNode = meetingNode(head);
        if (meetingNode == null) {
            return null;
        }
        int loopLen = lengthOfLoop(meetingNode);
        ListNode right = head;
        ListNode left = head;
        for (int i = 0; i < loopLen; i++) {
            right = right.next;
        }
        while (right != left) {
            right = right.next;
            left = left.next;
        }
        return left;
    }

    /**
     * 环形链表中相遇节点
     */
    private ListNode meetingNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = slow.next;
        while (slow != null && fast != null) {
            if (slow == fast) {
                return slow;
            }
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        return null;
    }

    /**
     * 环形链表的长度
     */
    private int lengthOfLoop(ListNode meetingNode) {
        int len = 1;
        ListNode crt = meetingNode;
        meetingNode = meetingNode.next;
        while (meetingNode != crt) {
            meetingNode = meetingNode.next;
            len++;
        }
        return len;
    }
}
