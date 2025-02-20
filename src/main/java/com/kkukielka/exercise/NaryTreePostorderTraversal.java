package com.kkukielka.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NaryTreePostorderTraversal {

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> list = new ArrayList<>();

        root.children.forEach(child -> list.addAll(postorder(child)));
        list.add(root.val);

        return list;
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
