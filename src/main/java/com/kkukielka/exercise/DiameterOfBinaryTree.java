package com.kkukielka.exercise;

public class DiameterOfBinaryTree {

    TreeNode previous;
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depthFirstTraversal(root);
        return diameter;
    }

    public int depthFirstTraversal(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int depth = 0;
        if (previous != null) {
            depth++;
        }

        previous = node;

        int leftDepth = depthFirstTraversal(node.left);
        int rightDepth = depthFirstTraversal(node.right);

        if (diameter < leftDepth + rightDepth) {
            diameter = leftDepth + rightDepth;
        }

        return Math.max(leftDepth, rightDepth) + depth;
    }

    public TreeNode buildTestNode() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2);

        node2.left = node4;
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
