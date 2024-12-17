package com.kkukielka.exercise;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        String[] split = s.split("\\s+");
        String lastWord = split[split.length - 1];
        return lastWord.length();
    }

}
