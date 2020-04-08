package com.kkukielka.exercise;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysExercises {
    public static void run() {
        // those are all correct ways to initialize 1-D arrays
        int array1D_1[];
        int[] array1D_2;
        // those are all correct ways to initialize 2-D arrays. 3rd one is weird but valid
        int array2D_1[][];
        int[][] array2D_2;
        int[] array2D_3[] = { {1,2}, {3,4} };
        Arrays.asList(array2D_3).stream().forEach(array -> print1DArray(array));
    }

    private static void print1DArray(int[] array) {
        String result = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.print(result + "\n");
    }

}
