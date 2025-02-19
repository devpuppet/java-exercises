package com.kkukielka.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> list = new ArrayList<>();

        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);

        return list;
    }

    public TreeNode buildTestNode() {
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node5 = new TreeNode(5);
        node5.left = node6;
        node5.right = node7;
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        node2.left = node4;
        node2.right = node5;
        TreeNode node9 = new TreeNode(9);
        TreeNode node8 = new TreeNode(8);
        node8.left = node9;
        TreeNode node3 = new TreeNode(3);
        node3.right = node8;
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
