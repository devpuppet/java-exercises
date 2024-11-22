package com.kkukielka.exercise;

public class LongestCommonPrefix {

    // ["flower","flight","flow"]
    public String longestCommonPrefix(String[] strs) {

        String commonPrefix = "";
        String firstWord = strs[0];

        for (int i = 0; i < firstWord.length(); i++) {
            String currentLetter = firstWord.substring(i, i+1);
            boolean addLetterToPrefix = true;
            for (int j = 0; j < strs.length; j++) {

                if (strs[j].length() <= i) {
                    addLetterToPrefix = false;
                    break;
                }

                String letter = strs[j].substring(i, i+1);
                if (!currentLetter.equals(letter)) {
                    addLetterToPrefix = false;
                    break;
                }
            }
            if (addLetterToPrefix) {
                commonPrefix = commonPrefix + currentLetter;
            } else {
                break;
            }
        }

        return commonPrefix;
    }

}
