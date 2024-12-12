package com.kkukielka.exercise;

public class FirstOccurrenceInString {

    // two pointers approach

    public int strStr(String haystack, String needle) {
        int index = -1;

        int k = 0;
        boolean found = false;
        for (int i = 0; i < haystack.length(); i++) {
            String current = haystack.substring(i, i + 1);
            String target = needle.substring(k, k + 1);

            if (current.equals(target) && k < needle.length()) {
                index = i;
                k++;
            } else {
                i = i - k;
                k = 0;
            }
            if (k == needle.length()) {
                found = true;
                break;
            }
        }

        return found ? index + 1 - needle.length() : -1;
    }
}
