package com.kkukielka.exercise;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {


    // two pointers approach
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            if (current != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    // solution using additional data structure (ArrayList)
    public int removeElement2(int[] nums, int val) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (current != val) {
                list.add(current);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }

}
