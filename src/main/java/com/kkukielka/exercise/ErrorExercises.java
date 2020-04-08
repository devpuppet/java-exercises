package com.kkukielka.exercise;

import java.io.FileNotFoundException;

public class ErrorExercises {

    public static void run() {
        try {
            throwError();
        } catch (Error e) {
            e.printStackTrace();
        }

        try {
            throwUncheckedException();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        try {
            throwCheckedException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void throwError() {
        throw new Error("I'm an Error (unchecked type) and shouldn't be caught");
    }

    public static void throwUncheckedException() {
        throw new IndexOutOfBoundsException("I'm unchecked exception (runtime)");
    }

    public static void throwCheckedException() throws FileNotFoundException {
        throw new FileNotFoundException("I'm checked exception and you have to catch me");
    }

}
