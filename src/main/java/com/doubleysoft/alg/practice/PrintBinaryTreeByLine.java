package com.doubleysoft.alg.practice;

import com.doubleysoft.alg.leetcode.tree.TreeNode;

import java.util.LinkedList;

/**
 * 按行打印二叉树
 */
public class PrintBinaryTreeByLine {
    public static void printBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> printQueue = new LinkedList<>();
        printQueue.add(root);
        int current = 1;
        int next = 0;
        StringBuilder sb = new StringBuilder();
        while (!printQueue.isEmpty()) {

            TreeNode head = printQueue.poll();
            System.out.printf("%-4d", head.getVal());
            current--;

            if (head.getLeft() != null) {
                printQueue.add(head.getLeft());
                next++;
            }
            if (head.getRight() != null) {
                printQueue.add(head.getRight());
                next++;
            }
            if (current == 0) {
                //System.out.println();
                current = next;
                next = 0;
            }
        }
    }

    static void tt() {
    }
}
