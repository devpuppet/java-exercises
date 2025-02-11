package com.kkukielka.exercise;

public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sumLeft = sumOfLeftLeaves(root.left);
        int sumRight = sumOfLeftLeaves(root.right);

        return hasLeftLeave(root) ? sumLeft + sumRight + root.left.val : sumLeft + sumRight;
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    private boolean hasLeftLeave(TreeNode node) {
        return node.left != null && isLeaf(node.left);
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
