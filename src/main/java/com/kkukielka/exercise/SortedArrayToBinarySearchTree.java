package com.kkukielka.exercise;

import java.util.Arrays;

public class SortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        if (nums.length == 0) {
            return null;
        }

        int middleIndex = nums.length / 2;
        TreeNode result = new TreeNode(nums[middleIndex]);
        result.left = sortedArrayToBST(Arrays.stream(nums).limit(middleIndex).toArray());
        result.right = sortedArrayToBST(Arrays.stream(nums).skip(middleIndex + 1).limit(nums.length - middleIndex).toArray());

        return result;
    }

    public int[] buildTestArray() {
        return new int[]{-10, -3, 0, 5, 9};
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
