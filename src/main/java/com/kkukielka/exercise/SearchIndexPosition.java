package com.kkukielka.exercise;

public class SearchIndexPosition {

    // divide and conquer pattern
    public int searchInsert(int[] nums, int target) {

        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int index = 0;

        while(leftIndex <= rightIndex) {

            int middleIndex = (rightIndex + leftIndex) / 2;
            int value = nums[middleIndex];

            if (value < target) {
                index = leftIndex + 1;
                leftIndex = middleIndex + 1;

            } else if (value > target) {
                index = middleIndex;
                rightIndex = middleIndex - 1;

            } else {
                index = middleIndex;
                break;
            }
        }

        return index;
    }

}
