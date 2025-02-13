package com.kkukielka.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindModeInBinarySearchTree {

    Map<Integer, Integer> map = new HashMap<>();

    public int[] findMode(TreeNode root) {
        depthFirstSearch(root);

        return findMostFrequentInts();
    }

    private void depthFirstSearch(TreeNode node) {
        if (node != null) {
            updateMap(node.val);

            depthFirstSearch(node.left);
            depthFirstSearch(node.right);
        }
    }

    private int[] findMostFrequentInts() {
        int maxCount = 0;
        List<Integer> modes = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > maxCount) {
                maxCount = value;
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                modes.add(entry.getKey());
            }
        }

        return modes.stream().mapToInt(Integer::intValue).toArray();
    }

    private void updateMap(int val) {
        Integer count = map.get(val);
        if (count == null) {
            map.put(val, 1);
        } else {
            map.put(val, count + 1);
        }
    }

    public TreeNode buildTestNode() {
        TreeNode node2_2 = new TreeNode(2);
        TreeNode node2_1 = new TreeNode(2);
        node2_1.left = node2_2;

        TreeNode node1 = new TreeNode(1);
        node1.right = node2_1;

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
