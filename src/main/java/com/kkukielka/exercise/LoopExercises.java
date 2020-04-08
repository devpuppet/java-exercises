package com.kkukielka.exercise;

public class LoopExercises {

    public static void run() {

    }

    // this is valid 'for' loop
    public static void infiniteLoop() {
        for(;;) {
            System.out.println("I'm in infinite loop!");
        }
    }

    // this is executed 4 times, 'for' loop holds it's own 'i' value
    public static void trickyLoop() {
        for (int i = 0; i < 4; i=i++) {
            i+=1;
            System.out.println(i);
        }
    }

}
