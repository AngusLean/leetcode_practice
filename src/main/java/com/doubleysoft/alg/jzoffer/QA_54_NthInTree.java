package com.doubleysoft.alg.jzoffer;

import com.doubleysoft.alg.BinaryTreeNode;

/**
 * 求二叉搜索树中第N大的节点
 * 实质上就是中序遍历
 */
public class QA_54_NthInTree {
    public BinaryTreeNode nthInTree(BinaryTreeNode root, int n) {
        BinaryTreeNode result = null;
        if (root.getLeft() != null) {
            result = nthInTree(root.getLeft(), n);
        }
        if (result == null) {
            if (n == 1) {
                result = root;
            }
            n--;

        }
        if (result == null && root.getRight() != null) {
            result = nthInTree(root.getRight(), n);
        }
        return result;
    }
}
