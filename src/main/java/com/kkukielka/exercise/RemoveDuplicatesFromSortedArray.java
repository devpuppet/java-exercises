package com.kkukielka.exercise;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    // two pointers approach
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            Integer previous = i == 0 ? null : nums[i - 1];

            if (previous != null && current != previous) {
                nums[k] = current;
                k++;
            } else if (previous == null) {
                k++;
            }

        }
        return k;
    }

    // also correct solution but slower
    public int removeDuplicates2(int[] nums) {
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        Iterator<Integer> iterator = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            nums[i] = iterator.next();
        }

        int k = set.size();

        return k;
    }

}
