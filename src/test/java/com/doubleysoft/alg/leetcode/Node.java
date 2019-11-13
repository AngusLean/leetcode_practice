package com.doubleysoft.alg.leetcode;

public class Node {
    int i;
    Node n;

    Node(int i) {
        this.i = i;
    }

    Node(Node n, int i) {
        this.i = i;
        this.n = n;
    }

    public static void main(String[] args) {
        Node nn = new Node(0);
        Node n1 = new Node(nn, 1);
        Node n2 = n1;

        n1.n = n1 = new Node(nn, 3);
        System.out.println(n1.toString() + n1.n.toString());
        System.out.println(n2.toString() + n2.n.toString());
    }

    @Override
    public String toString() {
        return i + " ";
    }
}
