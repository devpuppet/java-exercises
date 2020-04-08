package com.kkukielka.exercise;

import java.util.ArrayList;
import java.util.List;

public class GenericExercises {

    public static void run() {
        List list = new ArrayList();
        String str1 = "abc";
        int i = 1;
        char char1 = 'a';

        list.add(str1);
        list.add(i);
        list.add(char1);

        for (Object element : list) {
            System.out.println(element);
        }

    }

}
