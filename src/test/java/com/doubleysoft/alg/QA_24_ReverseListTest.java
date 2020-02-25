package com.doubleysoft.alg;

import com.doubleysoft.alg.jzoffer.QA_24_ReverseList;
import com.doubleysoft.alg.leetcode.Tuple;
import com.doubleysoft.alg.leetcode.list.ListNodeTestUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QA_24_ReverseListTest {
    private QA_24_ReverseList qa_24_reverseList;
    private List<Tuple<ListNode, ListNode>> testData;

    @Before
    public void setUp() throws Exception {
        qa_24_reverseList = new QA_24_ReverseList();
        testData = new ArrayList<Tuple<ListNode, ListNode>>() {{
            add(new Tuple<>(ListNode.build(1, 2, 3, 4, 5), ListNode.build(5, 4, 3, 2, 1)));
            add(new Tuple<>(ListNode.build(1), ListNode.build(1)));
        }};
    }

    @Test
    public void reverseList() {
        testData.forEach(row -> {
            System.out.println(row);
            ListNode result = qa_24_reverseList.reverseList(row.getFirst());
            ListNodeTestUtil.assertEqual(row.getSecound(), result);
        });
    }
}