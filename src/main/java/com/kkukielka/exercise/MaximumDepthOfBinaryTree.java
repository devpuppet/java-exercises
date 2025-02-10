package com.kkukielka.exercise;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int max = Math.max(maxDepth(root.left), maxDepth(root.right));

        return 1 + max;
    }

    public TreeNode buildTestNode() {
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        TreeNode node20 = new TreeNode(20);
        node20.left = node15;
        node20.right = node7;

        TreeNode node9 = new TreeNode(9);

        TreeNode node3 = new TreeNode(3);
        node3.left = node9;
        node3.right = node20;

        return node3;
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
