package com.kkukielka.exercise;

public class AnonymousClassExercise {

    public void run() {

        int age = new Age() { // anonymous class that implements Age interface
            public int getAge() {
                    return value;
            }
        }.getAge();

        System.out.println("Age: " + age);


        int height = new Height(180) { // anonymous class that implements abstract Height class
            public int getValue() {
                return value;
            }
        }.getValue();

        System.out.println("Height: " + height);

    }

    interface Age {
        int value = 18;
        int getAge();
    }

    abstract class Height {
        int value;
        public Height(int value) {
            this.value = value;
        }

        public abstract int getValue();

    }

}
