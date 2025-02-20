package com.kkukielka.exercise;

public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }

        if (root1 != null & root2 != null) {
            root1.val = root1.val + root2.val;
        }

        if (root1 == null) {
            return root2;
        }

        if (root2 == null) {
            return root1;
        }

        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }

    public TreeNode buildTestNode1() {
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);

        node3.left = node5;

        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);

        node1.left = node3;
        node1.right = node2;

        return node1;
    }

    public TreeNode buildTestNode2() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node1 = new TreeNode(1);

        node1.right = node4;

        TreeNode node7 = new TreeNode(7);
        TreeNode node3 = new TreeNode(3);

        node3.right = node7;

        TreeNode node2 = new TreeNode(2);
        node2.left = node1;
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
