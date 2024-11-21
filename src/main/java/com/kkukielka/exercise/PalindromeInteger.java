package com.kkukielka.exercise;

public class PalindromeInteger {

    // Solution without using String class
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }

            long divider = 1;
            while (divider * 10 < x) {
                divider *= 10;
            }

            long xLong = x;

            while(xLong > 0) {

                long rightDigit = xLong % 10;
                long leftDigit = xLong / divider;

                if (rightDigit != leftDigit) {
                    return false;
                }

                if (divider == 1) {
                    break;
                }

                // strip right digit
                xLong = xLong / 10;

                // strip left digit
                xLong = xLong % (divider / 10);
                divider /= 100;

            }
            return true;
        }


         public boolean isPalindromeNaiveSolution(int x) {
             String xString = String.valueOf(x);

             char[] chars = xString.toCharArray();

             int j = chars.length - 1;
             for (int i = 0; i < chars.length / 2; i++) {
                 if (chars[i] != chars[j]) {
                     return false;
                 }
                 j-=1;
             }

             return true;
         }
}
