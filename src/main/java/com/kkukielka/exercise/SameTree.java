package com.kkukielka.exercise;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }

        if (p == null && q == null) {
            return true;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public TreeNode buildTestNode1() {
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        return node1;
    }

    public TreeNode buildTestNode2() {
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        node1.left = node2;
        return node1;
    }

    public TreeNode buildTestNode3() {
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        node1.right = node2;
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
