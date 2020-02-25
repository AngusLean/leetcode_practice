package com.doubleysoft.alg.leetcode.list;

import com.doubleysoft.alg.ListNode;
import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class List_206_ReverseLinkedListTest {
    private List_206_ReverseLinkedList list_206_reverseLinkedList;
    private List<Tuple<ListNode, ListNode>> testData;

    @Before
    public void init() {
        list_206_reverseLinkedList = new List_206_ReverseLinkedList();
        testData = Arrays.asList(new Tuple<>(ListNode.build(1, 2, 3, 4, 5, 6), ListNode.build(6, 5, 4, 3, 2, 1)));
    }

    @Test
    public void reverseList() {
        testData.forEach(row -> {
            ListNodeTestUtil.assertEqual(list_206_reverseLinkedList.reverseList(row.getFirst()), row.getSecound());
        });
    }
}