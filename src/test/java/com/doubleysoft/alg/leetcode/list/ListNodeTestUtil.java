package com.doubleysoft.alg.leetcode.list;

import org.junit.Assert;

public class ListNodeTestUtil {
    public static void assertEqual(ListNode node1, ListNode node2) {
        while (node1 != null && node2 != null) {
            Assert.assertEquals(node1.val, node2.val);
            node1 = node1.next;
            node2 = node2.next;
        }
        if ((node1 != null && node2 == null) || (node1 == null && node2 != null)) {
            Assert.assertTrue(false);
        }
    }
}
