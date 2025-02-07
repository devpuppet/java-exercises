package com.kkukielka.exercise;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
       return depthFirstSearch(root.left, root.right);
    }

    private boolean depthFirstSearch(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if ((left == null && right != null) || (left != null && right == null)) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return depthFirstSearch(left.left, right.right) && depthFirstSearch(left.right, right.left);
    }
    public TreeNode buildTestNode1() {
        TreeNode node3_1 = new TreeNode(3);
        TreeNode node4_1 = new TreeNode(4);
        TreeNode node2_1 = new TreeNode(2);
        node2_1.left = node3_1;
        node2_1.right = node4_1;

        TreeNode node3_2 = new TreeNode(3);
        TreeNode node4_2 = new TreeNode(4);
        TreeNode node2_2 = new TreeNode(2);
        node2_2.left = node4_2;
        node2_2.right = node3_2;

        TreeNode node1 = new TreeNode(1);
        node1.left = node2_1;
        node1.right = node2_2;
        return node1;
    }

    public TreeNode buildTestNode2() {
        TreeNode node2_1 = new TreeNode(2);
        TreeNode node2_12 = new TreeNode(2);
        node2_12.left = node2_1;

        TreeNode node2_2 = new TreeNode(2);
        TreeNode node2_22 = new TreeNode(2);
        node2_22.left = node2_2;

        TreeNode node1 = new TreeNode(1);
        node1.left = node2_1;
        node1.right = node2_2;

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
