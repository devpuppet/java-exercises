package com.kkukielka.exercise;

public class AnonymousClassExercise {

    public void run() {

        // anonymous class that implements Age interface
        int age = new Age() {
            public int getAge() {
                    return value;
            }
        }.getAge();

        System.out.println("Age: " + age);


        // anonymous class that implements abstract Height class
        int height = new Height(180) {
            public int getValue() {
                return value;
            }
        }.getValue();

        System.out.println("Height: " + height);

        // weird runnable
        Runnable obj = new Object() {
            int val = 0;
            {
                val = 5;
            }
            void showVal() {
                System.out.println(val);
            }
        }::showVal; // we assign showVal method reference to obj. This is possible because
        // Runnable is a functional interface (has one method with identical signature as showVal
        // - 0 arguments and returns void)
        obj.run(); // displays 5

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
