package com.kkukielka.exercise;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return isSubtreeBalanced(root).isBalanced;
    }

    private Result isSubtreeBalanced(TreeNode node) {
        if (node == null) {
            return new Result(true, 0);
        }

        Result leftResult = isSubtreeBalanced(node.left);
        Result rightResult = isSubtreeBalanced(node.right);

        if (!leftResult.isBalanced || !rightResult.isBalanced) {
            return new Result(false, 0);
        }

        int leftHeight = leftResult.height;
        int rightHeight = rightResult.height;
        if ((-1 > leftHeight - rightHeight) || (leftHeight - rightHeight > 1)) {
            return new Result(false, 0);
        }

        int maxHeight = Math.max(leftHeight, rightHeight);

        return new Result(true, maxHeight + 1);
    }

    class Result {
        private boolean isBalanced;
        private int height;

        public Result(boolean isBalanced, int height) {
            this.isBalanced = isBalanced;
            this.height = height;
        }
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

    public TreeNode buildTestNode2() {
        TreeNode node4_1 = new TreeNode(4);
        TreeNode node4_2 = new TreeNode(4);
        TreeNode node3_1 = new TreeNode(3);
        node3_1.left = node4_1;
        node3_1.right = node4_2;

        TreeNode node2_1 = new TreeNode(2);
        TreeNode node3_2 = new TreeNode(3);
        node2_1.left = node3_1;
        node2_1.right = node3_2;

        TreeNode node2_2 = new TreeNode(2);
        TreeNode node1_1 = new TreeNode(1);
        node1_1.left = node2_1;
        node1_1.right = node2_2;

        return node1_1;
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
