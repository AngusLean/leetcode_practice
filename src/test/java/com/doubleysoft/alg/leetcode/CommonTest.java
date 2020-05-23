package com.doubleysoft.alg.leetcode;

import com.doubleysoft.alg.ListNode;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class A extends Exception {
}

class B extends A {
}

public class CommonTest {

    public static void main(String[] args) {

    }

    private void countOfWord(String file, String word) {
        int count = 0;
        try (FileReader fileInputStream = new FileReader(new File(file))) {
            try (BufferedReader reader = new BufferedReader(fileInputStream)) {
                String line = reader.readLine();
                int index = -1;
                while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
                    count++;
                    line = line.substring(index + word.length());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2); // false
        System.out.println(s1 == s5); // true
        System.out.println(s1 == s6); // false
        System.out.println(s1 == s6.intern()); // true
        System.out.println(s2 == s2.intern()); // false
    }


    private ListNode reverseNode(ListNode head) {
        ListNode prev = null;
        ListNode newHead = null;
        ListNode tmp = head;
        while (tmp != null) {
            ListNode next = tmp.next;
            if (next == null) {
                newHead = tmp;
            }
            tmp.next = prev;
            prev = tmp;
            tmp = next;
        }
        return newHead;
    }

    private ListNode reverseNode(ListNode head, ListNode target) {
        ListNode prev = null;
        ListNode newHead = null;
        ListNode tmp = head;
        while (tmp != target) {
            ListNode next = tmp.next;
            if (next == null) {
                newHead = tmp;
            }
            tmp.next = prev;
            prev = tmp;
            tmp = next;
        }
        return newHead;
    }

}
