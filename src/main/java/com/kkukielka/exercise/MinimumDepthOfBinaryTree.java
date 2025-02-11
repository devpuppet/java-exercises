package com.kkukielka.exercise;

public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        return leftDepth > 0 && rightDepth > 0 ? 1 + Math.min(leftDepth, rightDepth) : 1 + Math.max(leftDepth, rightDepth);
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

    // [2,null,3,null,4,null,5,null,6]
    //          2
    //      n       3
    //            n  4
    //              n 5
    //               n 6

    public TreeNode buildTestNode2() {
        TreeNode node6 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5);
        node5.right = node6;

        TreeNode node4 = new TreeNode(4);
        node4.right = node5;

        TreeNode node3 = new TreeNode(3);
        node3.right = node4;

        TreeNode node2 = new TreeNode(2);
        node2.right = node3;

        TreeNode node1 = new TreeNode(1);
        node1.right = node2;

        return node1;
    }

    // [-9,-3,2,null,4,4,0,-6,null,-5]
    //          -9
    //      -3         2
    //   n     4     4   0
    //       -6  n -5

    public TreeNode buildTestNode3() {

        TreeNode node_negative_6 = new TreeNode(-6);
        TreeNode node_left_4 = new TreeNode(4);
        node_left_4.left = node_negative_6;

        TreeNode node_negative_3 = new TreeNode(-3);
        node_negative_3.right = node_left_4;

        TreeNode node_negative_5 = new TreeNode(-5);
        TreeNode node_right_4 = new TreeNode(4);
        node_right_4.left = node_negative_5;

        TreeNode node_2 = new TreeNode(2);
        node_2.left = node_right_4;

        TreeNode node_0 = new TreeNode(0);
        node_2.right = node_0;

        TreeNode node_negative_9 = new TreeNode(-9);
        node_negative_9.left = node_negative_3;
        node_negative_9.right = node_2;

        return node_negative_9;
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
