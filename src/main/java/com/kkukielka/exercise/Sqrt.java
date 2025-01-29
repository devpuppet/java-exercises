package com.kkukielka.exercise;

public class Sqrt {

    public int mySqrt(int x) {
        int result = 0;
        int left = 0;
        int right = x;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            long candidate = (long) middle * middle;

            if (candidate > x) {
                right = middle - 1;
            } else if (candidate < x) {
                left = middle + 1;
                result = middle;
            } else {
                return middle;
            }
        }

        return result;
    }
}
