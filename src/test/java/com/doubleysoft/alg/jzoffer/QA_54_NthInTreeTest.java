package com.doubleysoft.alg.jzoffer;

import com.doubleysoft.alg.BinaryTreeNode;
import com.doubleysoft.alg.leetcode.Tuple3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QA_54_NthInTreeTest {
    private List<Tuple3<BinaryTreeNode, Integer, BinaryTreeNode>> testData;
    private QA_54_NthInTree qa_54_nthInTree;

    @Before
    public void setUp() throws Exception {
        qa_54_nthInTree = new QA_54_NthInTree();
        testData = new ArrayList<Tuple3<BinaryTreeNode, Integer, BinaryTreeNode>>() {{
            add(new Tuple3<>(
                    new BinaryTreeNode(5,
                            new BinaryTreeNode(3, new BinaryTreeNode(2), new BinaryTreeNode(4)),
                            new BinaryTreeNode(7, new BinaryTreeNode(6), new BinaryTreeNode(8))),
                    5,
                    new BinaryTreeNode(6)));
        }};
    }

    @Test
    public void nthInTree() {
        testData.forEach(row -> {
            System.out.println(row);
            BinaryTreeNode binaryTreeNode = qa_54_nthInTree.nthInTree1(row.getFirst(), row.getSecound());
            Assert.assertTrue(binaryTreeNode.getVal() == row.getThird().getVal());
        });
    }

    @Test
    public void testPrint() {
        qa_54_nthInTree.middleSortPrint(testData.get(0).getFirst());
    }
}