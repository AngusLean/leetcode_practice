package com.doubleysoft.alg.jzoffer;

import com.doubleysoft.alg.ListNode;
import com.doubleysoft.alg.ListNodeTestUtil;
import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QA_25_MergeSortedListTest {
    private QA_25_MergeSortedList qa_25_mergeSortedList;
    private List<Tuple3<ListNode, ListNode, ListNode>> testData;

    @Before
    public void setUp() throws Exception {
        qa_25_mergeSortedList = new QA_25_MergeSortedList();
        testData = new ArrayList<Tuple3<ListNode, ListNode, ListNode>>() {{
            add(new Tuple3<>(ListNode.build(3, 5, 7, 9), ListNode.build(1, 4, 10), ListNode.build(1, 3, 4, 5, 7, 9, 10)));
            add(new Tuple3<>(ListNode.build(1), ListNode.build(2), ListNode.build(1, 2)));
        }};
    }

    @Test
    public void mergeSortedList() {
        testData.forEach(row -> {
            System.out.println(row);
            ListNode result = qa_25_mergeSortedList.mergeSortedList(row.getFirst(), row.getSecound());
            ListNodeTestUtil.assertEqual(row.getThird(), result);
        });
    }
}