package com.doubleysoft.alg.leetcode.list;

/**
 * @see <a href="https://leetcode.com/problems/palindrome-linked-list/">234. Palindrome Linked List</a>
 */
public class List_234_PalindromeList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        int len=0;
        ListNode temp = head;
        while(temp != null){
            len ++;
            temp = temp.next;
        }
        if(len == 0){
            return true;
        }
        int left=0, right=len-1;
        while (left < right){
            if(getValInPos(head, left) == getValInPos(head, right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }

    private int getValInPos(ListNode head, int index) {
        ListNode temp = head;
        int crt = 0;
        while (crt != index){
            temp = temp.next;
            crt++;
        }
        return temp.val;
    }

    public boolean isPalindrome1(ListNode head) {
        if (head == null) {
            return false;
        }
        int length = 0;
        ListNode tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        if (length == 1) {
            return true;
        }

        ListNode middle = head;
        int md = length % 2 == 0 ? length / 2 : length / 2 + 1;
        for (int i = 0; i < md; i++) {
            middle = middle.next;
        }
        ListNode newHead = reverseNode(head, length / 2);
        for (int i = 0; i < length / 2; i++) {
            if (newHead != null && middle != null) {
                if (newHead.val != middle.val)
                    return false;
                newHead = newHead.next;
                middle = middle.next;
            } else {
                return false;
            }
        }
        return true;
    }

    private ListNode reverseNode(ListNode head, int len) {
        ListNode crt = null;
        ListNode tmp = head;
        ListNode newHead = null;
        int num = 0;
        while (num < len) {
            if (++num >= len) {
                newHead = tmp;
            }
            ListNode next = tmp.next;
            tmp.next = crt;
            crt = tmp;
            tmp = next;
        }
        return newHead;
    }
}
