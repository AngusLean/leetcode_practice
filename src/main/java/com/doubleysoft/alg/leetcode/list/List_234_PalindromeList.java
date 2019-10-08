package com.doubleysoft.alg.leetcode.list;

/**
 * @see <a href="https://leetcode.com/problems/palindrome-linked-list/">234. Palindrome Linked List</a>
 */
public class List_234_PalindromeList {
    public static boolean isPalindrome(ListNode head) {
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

    private static int getValInPos(ListNode head, int index){
        ListNode temp = head;
        int crt = 0;
        while (crt != index){
            temp = temp.next;
            crt++;
        }
        return temp.val;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
