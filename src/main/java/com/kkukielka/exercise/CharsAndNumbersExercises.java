package com.kkukielka.exercise;

public class CharsAndNumbersExercises {

    public static void run() {

        char letter = 'Z';
        int value = 0;
        char z = 90;
        // char error = 65536; // compilation error, Unicode has range 0-65535
        int a = 'a';
        float f = 'f';

        // prints 97
        System.out.println(a);

        // prints 102.0
        System.out.println(f);

        // prints Z because 90 is unicode value for Z
        System.out.println(z);

        // prints Z. UTF-16 Unicode has range 0-65535.
        // 0 is in range of Unicode so no type promotion is performed
        System.out.println(true ? letter : 0);

        // prints 90. Type promotion to int is performed because
        // 65536 exceeds Unicode range
        System.out.println(true ? letter : 65536);

        // prints 102 as 'a' is promoted to int (97) and added to 5
        System.out.println('a' + 5);

        // prints 90. Type promotion is also performed because we call 'value' variable
        // which is not final. That means that 'true ? letter : value' expression is
        // not a constant expression
        System.out.println(true ? letter : value);

    }

}
