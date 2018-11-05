package com.coderbd.tree;

public class Node {

    int key;
    Node left, right;

    public Node(int item) {
        this.key = item;
        left = right = null;
    }

}
