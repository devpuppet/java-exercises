package com.kkukielka.exercise;

public class BinaryTreeTilt {

    int tiltSum = 0;

    public int findTilt(TreeNode root) {
        postOrderTraversal(root);
        return tiltSum;
    }

    private int postOrderTraversal(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftSum = postOrderTraversal(node.left);
        int rightSum = postOrderTraversal(node.right);
        tiltSum += Math.abs(leftSum - rightSum);

        return node.val + leftSum + rightSum;
    }

    public TreeNode buildTestNode() {
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);

        node1.left = node2;
        node1.right = node3;

        return node1;
    }

    // [4,2,9,3,5,null,7]
    //        4
    //    2       9
    //  3   5    n  7

    public TreeNode buildTestNode2() {
        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2);

        node2.left = node3;
        node2.right = node5;

        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);

        node9.right = node7;

        TreeNode node4 = new TreeNode(4);
        node4.left = node2;
        node4.right = node9;

        return node4;
    }

    // [1,2,null,3,4]
    //           1
    //       2      n
    //     3   4

    public TreeNode buildTestNode3() {
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);

        node2.left = node3;
        node2.right = node4;

        TreeNode node1 = new TreeNode(1);
        node1.left = node2;

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
