package com.kkukielka.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        return traverse(root, "");
    }

    private List<String> traverse(TreeNode node, String path) {
        if (node == null) {
            return Collections.emptyList();
        }

        if (isLeafNode(node)) {
            path = appendPath(path, node);
            return Collections.singletonList(path);
        }

        path = appendPath(path, node);

        List<String> list = new ArrayList<>();
        list.addAll(traverse(node.left, path));
        list.addAll(traverse(node.right, path));

        return list;
    }

    private boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }

    private String appendPath(String path, TreeNode node) {
        return path.isEmpty() ? String.format("%s", node.val): String.format("%s->%s", path, node.val);
    }

    public TreeNode buildTestNode() {
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2);
        node2.right = node5;

        TreeNode node3 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;

        return node1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
