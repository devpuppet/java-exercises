package com.kkukielka.exercise;

public class ClimbStairs {

    // 8 5 3 2 1 1

    public int climbStairs(int n) {
        int first = 1;
        int second = 1;

        for (int i = n-1; i >= 1; i--) {
            int temp = first;
            first = first + second;
            second = temp;
        }

        return first;
    }


}
