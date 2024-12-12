package com.kkukielka;

import com.kkukielka.exercise.*;

public class Main {

    public static void main(String[] args) {
        //SubstringExercises.run();
        //LoopExercises.run();
        //ErrorExercises.run();
//        GenericExercises.run2();
        //new AnonymousClassExercise().run();
        //BigDecimalExercises.run();
        //ArraysExercises.run();
        //CharsAndNumbersExercises.run();
//        new PalindromeInteger().isPalindrome(1410110141);
//        new RomanToInteger().romanToInt("MCMXCIV");
//        new RomanToInteger().romanToInt("III");
//        new LongestCommonPrefix().longestCommonPrefix(new String[] {"flower","flight","flow"});
//        new LongestCommonPrefix().longestCommonPrefix(new String[] {"ab","a"});
//        new ValidParentheses().isValid("[()](){}");
//        new ValidParentheses().isValid("){");
//        new ValidParentheses().isValid("(])");
        MergeTwoSortiedLists merge = new MergeTwoSortiedLists();
        merge.mergeTwoLists(merge.buildTestList1(), merge.buildTestList2());
        merge.mergeTwoLists(null, merge.buildTestList3());
        merge.mergeTwoLists(merge.buildTestList4(), null);
    }

}
