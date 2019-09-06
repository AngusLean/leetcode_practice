package com.doubleysoft.alg.leetcode.list;

/**
 * @see <a href="https://leetcode.com/problems/palindrome-linked-list/">234. Palindrome Linked List</a>
 */
public class List_234_PalindromeList {
    public static boolean isPalindrome(ListNode head) {
        int sum = 0;
        while (head != null) {
            sum = sum * 10 + head.val;
            head = head.next;
        }
        int result = 0, temp = sum;
        while (temp > 0) {
            result = result * 10 + temp % 10;
            temp = temp / 10;
        }
        return result == sum;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
