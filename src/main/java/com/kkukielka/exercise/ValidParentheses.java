package com.kkukielka.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    // [()](){}
    //
    //
    // [(])[]
    //

    public boolean isValid(String s) {

        Map<String, String> bracketsMap = initializeBracketsMap();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String bracket = s.substring(i, i +1 );
            if (bracketsMap.containsKey(bracket) && !stack.isEmpty()) {
                String lastBracket = stack.peek();
                if (bracketsMap.get(bracket).equals(lastBracket)) {
                    stack.pop();
                } else {
                    break;
                }
            } else {
                stack.push(bracket);
            }
        }

        return stack.isEmpty();
    }

    private Map<String, String> initializeBracketsMap() {
        Map<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("]", "[");
        map.put("}", "{");
        return map;
    }

    //naive solution
//    public boolean isValid(String s) {
//
//        if(s.length() == 1) {
//            return false;
//        }
//
//        boolean isEmpty = false;
//
//        int i = 0;
//        while (!isEmpty) {
//            String bracket = s.substring(i, i + 1);
//
//            if (isClosingBracket(bracket) && i == 0) {
//                break;
//            }
//
//            if (!nextBrascketExists(s, i)) {
//                break;
//            }
//            String nextBracket = s.substring(i + 1, i + 2);
//
//            if (isOpeningBracket(bracket) && isOpeningBracket(nextBracket)) {
//                i++;
//                continue;
//            }
//
//            if (isOpeningBracket(bracket) && isClosingBracket(nextBracket)) {
//                String expectedClosingBracket = getClosingBracket(bracket);
//                if (nextBracket.equals(expectedClosingBracket)) {
//                    s = s.substring(0, i) + s.substring(i + 2);
//                    if (i > 0) {
//                        i--;
//                    }
//                } else {
//                    break;
//                }
//            }
//
//            isEmpty = s.equals("");
//        }
//
//        return isEmpty;
//    }
//
//    private boolean nextBrascketExists(String s, int i) {
//        return s.length() >= i + 2;
//    }
//
//    private boolean isOpeningBracket(String s) {
//        return s.equals("(") || s.equals("[") || s.equals("{");
//    }
//
//    private boolean isClosingBracket(String s) {
//        return s.equals(")") || s.equals("]") || s.equals("}");
//    }
//
//    private String getClosingBracket(String s) {
//        switch (s) {
//            case "(":
//                return ")";
//            case "[":
//                return "]";
//            case "{":
//                return "}";
//            default:
//                throw new RuntimeException("Unknown bracket: " + s);
//        }
//    }

}
