package com.kkukielka.exercise;

import java.math.BigDecimal;

public class BigDecimalExercises {

    public static void run() {
        // this code snippet will return true. In case of creating BigDecimal object by BigDecimal.valueOf
        // with values from 0 to 10, new object is not created but fetched from an pre-initialized array
        // which holds those objects (zeroThroughTen field in BigDecimal, it can save a lot o memory).
        // Thus comparing the reference of those two objects will return true
        BigDecimal bd1 = BigDecimal.valueOf(2);
        BigDecimal bd2 = BigDecimal.valueOf(2);
        System.out.println(bd1 == bd2);

        // Returns false. The same rules as above but here new objects ARE created because value is not in 0-10 range
        bd1 = BigDecimal.valueOf(20);
        bd2 = BigDecimal.valueOf(20);
        System.out.println(bd1 == bd2);

        // Returns false. Here we compare the references if they point to the same object. Of course - they don't.
        bd1 = new BigDecimal(2);
        bd2 = new BigDecimal(2);
        System.out.println(bd1 == bd2);
    }

}
