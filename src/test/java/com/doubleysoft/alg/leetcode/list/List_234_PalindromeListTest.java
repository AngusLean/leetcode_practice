package com.doubleysoft.alg.leetcode.list;

import com.doubleysoft.alg.leetcode.Tuple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author dongyang.yu
 * @email dongyang.yu@anxincloud.com
 */
public class List_234_PalindromeListTest {
    private List<Tuple<ListNode, Boolean>> testData = null;
    private List_234_PalindromeList list_234_palindromeList;

    @Before
    public void init() {
        testData = Arrays.asList(
                new Tuple<>(null, false),
                new Tuple<>(ListNode.build(0, 0), true),
                new Tuple<>(ListNode.build(1, 2, 3, 2, 1), true),
                new Tuple<>(ListNode.build(0), true),
                new Tuple<>(ListNode.build(1, 2, 2, 1), true),
                new Tuple<>(ListNode.build(1, 2, 3, 2, 1), true)
        );
        list_234_palindromeList = new List_234_PalindromeList();
    }

    @Test
    public void isPalindrome() {
        testData.forEach(row -> {
            Assert.assertEquals(list_234_palindromeList.isPalindrome(row.getFirst()), row.getSecound());
        });
    }

    @Test
    public void isPalindrome1() {
        testData.forEach(row -> {
            System.out.println(row);
            Assert.assertEquals(list_234_palindromeList.isPalindrome1(row.getFirst()), row.getSecound());
        });
    }
}