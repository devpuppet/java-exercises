package com.kkukielka.exercise;

public class SubstringExercises {

    private static String value = "Hello World!";

    public static void run() {
        String str1 = value.substring(0, 6);
        String str2 = value.substring(6, 12);
        String str3 = null;
        try {
            str3 = value.substring(12, 6);
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        print(str1);
        print(str2);
        print(str3);

    }

    private static void print(String value) {
        System.out.println("|" + value + "|");
    }

}
