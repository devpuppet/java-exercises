package com.kkukielka.exercise;

import java.util.*;

public class AddBinary {

    public String addBinary(String a, String b) {

        Stack<Integer> stack = new Stack<>();
        int[] listA = Arrays.stream(a.split("")).mapToInt(Integer::valueOf).toArray();
        int[] listB = Arrays.stream(b.split("")).mapToInt(Integer::valueOf).toArray();

        int[] temp = listA;
        if (listB.length > listA.length) {
            listA = listB;
            listB = temp;
        }

        int j = listB.length - 1;

        boolean carryOver = false;
        for (int i = listA.length - 1; i >= 0; i--) {
            if (carryOver) {
                listA[i] = listA[i] + 1;
            }
            int valueA = listA[i];
            int valueB = 0;
            if (j >= 0) {
                valueB = listB[j];
            }
            int result = valueA + valueB;
            carryOver = false;
            if (result == 2) {
                carryOver = true;
                stack.push(0);
            } else if (result == 3) {
                carryOver = true;
                stack.push(1);
            }
            else {
                stack.push(result);
            }
            j--;
        }

        if (carryOver) {
            stack.push(1);
        }

        String result = "";
        int iterations = stack.size();
        for (int i = 0; i < iterations; i++) {
            result = result + stack.pop();
        }
        return result;
    }
}
