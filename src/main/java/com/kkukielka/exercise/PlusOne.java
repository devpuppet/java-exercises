package com.kkukielka.exercise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        digits[index] = digits[index] + 1;

        while (index >= 0) {
            if (digits[index] > 9) {
                digits[index] = 0;
                if (index == 0) {
                    digits = IntStream.concat(Arrays.stream(new int[] {1}), Arrays.stream(digits)).toArray();
                } else {
                    digits[index - 1] = digits[index - 1] + 1;
                }
                index--;
            } else {
                break;
            }
        }

        return digits;
    }

}
