package com.doubleysoft.alg.jzoffer;

import com.doubleysoft.alg.BinaryTreeNode;

/**
 * 求二叉搜索树中第N大的节点
 * 实质上就是中序遍历
 */
public class QA_54_NthInTree {
    private int count = 0;
    public BinaryTreeNode nthInTree(BinaryTreeNode root, int n) {
        if (root == null || n <= 0) {
            return null;
        }
        BinaryTreeNode result = null;
        if (root.getLeft() != null) {
            result = nthInTree(root.getLeft(), n);

        }
        count++;
        if (result == null) {
            if (count == n) {
                result = root;
            }
        }

        if (result == null && root.getRight() != null) {
            result = nthInTree(root.getRight(), n);
        }

        return result;
    }

    public BinaryTreeNode nthInTree1(BinaryTreeNode root, int n) {
        if (root == null || n <= 0) {
            return null;
        }
        BinaryTreeNode result = null;
        if (root.getLeft() != null) {
            result = nthInTree(root.getLeft(), n);

        }
        n--;
        if (result == null) {
            if (n == 0) {
                result = root;
            }
        }

        if (result == null && root.getRight() != null) {
            result = nthInTree(root.getRight(), n);
        }

        return result;
    }

    /**
     * 中序遍历
     */
    public void middleSortPrint(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        if (root.getLeft() != null) {
            middleSortPrint(root.getLeft());
        }
        System.out.println(root.getVal());
        if (root.getRight() != null) {
            middleSortPrint(root.getRight());
        }
    }
}
