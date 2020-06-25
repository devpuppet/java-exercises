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

    public static void run2() {
        List<String> listStr = new ArrayList<>();
        listStr.add("aaa");
        listStr.add("bbb");
        List<?> listIntermediate = listStr;
        List<Integer> listInt = (List<Integer>) listIntermediate;
        System.out.println(listInt.size()); // prints 2
        System.out.println(listInt.get(0) + 2); // here throws ClassCastException
        // above behavior is called 'heap pollution' and is caused by type erasure
        // interesting that below code will throw a compile-time error (inconvertible types), unlike ethe example above
        //  List<String> listStr2 = new ArrayList<>();
        //  List<Integer> listInt2 = (List<Integer>) listStr2;
    }

}
