package com.doubleysoft.alg.leetcode.tree;

public class TreeNode<T> {
    private T val;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T val, TreeNode<T> left, TreeNode<T> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(T val) {
        this(val, null, null);
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + val.toString() + "]";
    }
}
