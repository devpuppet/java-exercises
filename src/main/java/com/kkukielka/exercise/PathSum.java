package com.kkukielka.exercise;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (isLeafNode(root) && root.val - targetSum == 0) {
            return true;
        }

        boolean leftSum = hasPathSum(root.left, targetSum - root.val);
        boolean rightSum = hasPathSum(root.right, targetSum - root.val);

        return leftSum || rightSum;
    }

    private boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public TreeNode buildTestNode() {
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        TreeNode node11 = new TreeNode(11);
        node11.left = node7;
        node11.right = node2;

        TreeNode node4_1 = new TreeNode(4);
        node4_1.left = node11;

        TreeNode node1 = new TreeNode(1);
        TreeNode node4_2 = new TreeNode(4);
        node4_2.right = node1;

        TreeNode node13 = new TreeNode(13);
        TreeNode node8 = new TreeNode(8);
        node8.left = node13;
        node8.right = node4_2;

        TreeNode node5 = new TreeNode(5);
        node5.left = node4_1;
        node5.right = node8;

        return node5;
    }

    public TreeNode buildTestNode2() {
        TreeNode node2 = new TreeNode(-2);
        TreeNode node3 = new TreeNode(-3);
        node2.right = node3;

        return node2;
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
