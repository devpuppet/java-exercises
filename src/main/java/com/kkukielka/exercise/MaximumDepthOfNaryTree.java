package com.kkukielka.exercise;

import java.util.ArrayList;
import java.util.List;

public class MaximumDepthOfNaryTree {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.children == null) {
            return 1;
        }

        int maxDepth = 0;

        for (int i = 0; i < root.children.size(); i++) {
            maxDepth = Math.max(maxDepth(root.children.get(i)), maxDepth);
        }

        return maxDepth + 1;
    }

    public Node buildTestNode() {
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node3 = new Node(3);

        node3.children = new ArrayList<>();
        node3.children.add(node5);
        node3.children.add(node6);

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node4 = new Node(4);

        node1.children = new ArrayList<>();
        node1.children.add(node3);
        node1.children.add(node2);
        node1.children.add(node4);

        return node1;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}
