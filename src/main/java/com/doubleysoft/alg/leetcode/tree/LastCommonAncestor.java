package com.doubleysoft.alg.leetcode.tree;

public class LastCommonAncestor {
    public TreeNode getLastCommonAncestor(TreeNode root, TreeNode left, TreeNode right) {
        if (root == null) {
            return null;
        }
        if (root == left || root == right) {
            return root;
        }
        TreeNode lf = getLastCommonAncestor(root.getLeft(), left, right);
        TreeNode rf = getLastCommonAncestor(root.getRight(), left, right);
        if (lf != null && rf != null) {
            return root;
        }
        if (lf == null) {
            return rf;
        }
        return lf;
    }
}
