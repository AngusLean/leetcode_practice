package com.doubleysoft.alg.leetcode.list;

import com.doubleysoft.alg.ListNode;
import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
public class List_203_RemoveLinkedListElementsTest {
    private static List<Tuple3<ListNode, Integer, ListNode>> testData;
    private List_203_RemoveLinkedListElements list_203_removeLinkedListElements;


    @Before
    public void setUp() throws Exception {
        list_203_removeLinkedListElements = new List_203_RemoveLinkedListElements();
        testData = Arrays.asList(
                new Tuple3<>(ListNode.build(), 1, ListNode.build()),
                new Tuple3<>(ListNode.build(1, 2, 3, 5), 3, ListNode.build(1, 2, 5)),
                new Tuple3<>(ListNode.build(2, 2, 3, 2), 2, ListNode.build(3)),
                new Tuple3<>(ListNode.build(1, 2, 2, 1), 2, ListNode.build(1, 1))

        );
    }

    @Test
    public void removeElements() {
        testData.forEach(row -> {
            ListNode listNode = list_203_removeLinkedListElements.removeElements(row.getFirst(), row.getSecound());
            ListNodeTestUtil.assertEqual(listNode, row.getThird());
        });
    }
}