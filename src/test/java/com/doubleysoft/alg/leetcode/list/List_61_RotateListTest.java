package com.doubleysoft.alg.leetcode.list;

import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class List_61_RotateListTest {
    private List_61_RotateList list_61_rotateList;
    private List<Tuple3<ListNode, Integer, ListNode>> testData;

    @Before
    public void setUp() throws Exception {
        list_61_rotateList = new List_61_RotateList();
        ListNode source = ListNode.build(1, 2, 3, 4, 5);
        ListNode target = ListNode.build(4, 5, 1, 2, 3);

        testData = Arrays.asList(
                new Tuple3<>(ListNode.build(1, 2, 3, 4, 5), 2, ListNode.build(4, 5, 1, 2, 3)),
                new Tuple3<>(ListNode.build(0, 1, 2), 4, ListNode.build(2, 0, 1))
        );
    }

    @Test
    public void rotateRight() {
        testData.forEach(row -> {
            ListNode listNode = list_61_rotateList.rotateRight(row.getFirst(), row.getSecound());
            ListNodeTestUtil.assertEqual(listNode, row.getThird());
        });
    }
}