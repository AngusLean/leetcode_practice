package com.doubleysoft.alg.jzoffer;

import com.doubleysoft.alg.ListNode;
import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QA_23_HeadOfCircleListTest {
    private QA_23_HeadOfCircleList qa_23_headOfCircleList;
    private List<Tuple<ListNode, ListNode>> testData;

    @Before
    public void setUp() throws Exception {
        qa_23_headOfCircleList = new QA_23_HeadOfCircleList();
        ListNode head = ListNode.build(1);
        ListNode entryNode = new ListNode(2);
        head.next = entryNode;
        entryNode.next = new ListNode(3);
        entryNode.next.next = new ListNode(4);
        entryNode.next.next.next = new ListNode(5);
        entryNode.next.next.next.next = entryNode;

        testData = new ArrayList<Tuple<ListNode, ListNode>>() {{
            add(new Tuple<>(head, entryNode));
        }};
    }

    @Test
    public void entryNodeOfLoop() {
        testData.forEach(row -> {
            //System.out.println(row);
            ListNode listNode = qa_23_headOfCircleList.entryNodeOfLoop(row.getFirst());
            Assert.assertTrue(row.getSecound() == listNode);
        });
    }
}