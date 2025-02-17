package com.kkukielka.exercise;

public class MinimumAbsoluteDifferenceInBST {

    Integer minimumDiff;
    TreeNode previous;

    public int getMinimumDifference(TreeNode root) {
        inorderTraversal(root);
        return minimumDiff;
    }

    private void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);

        if (previous != null && minimumDiff == null) {
            minimumDiff = Math.abs(node.val - previous.val);
        } else if (previous != null) {
            minimumDiff = Math.min(minimumDiff, Math.abs(node.val - previous.val));
        }
        previous = node;

        inorderTraversal(node.right);
    }

    public TreeNode buildTestNode() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);

        node2.left = node1;
        node2.right = node3;

        TreeNode node6 = new TreeNode(6);
        TreeNode node4 = new TreeNode(4);

        node4.left = node2;
        node4.right = node6;

        return node4;
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
