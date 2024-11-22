package com.kkukielka.exercise;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {

        Map<String, Integer> map = initMap();

        int result = 0;

        for (int i = 0; i <= s.length() - 1; i++) {
            if (i + 1 < s.length() && (map.get(s.substring(i, i+1)) < map.get(s.substring(i+1, i+2)))) {
                result -= map.get(s.substring(i, i+1));
            } else {
                result += map.get(s.substring(i, i+1));
            }
        }

        return result;
    }

    // naive solution
//    public int romanToInt(String s) {
//
//        Map<String, Integer> map = initMap();
//
//        String[] letters = s.split("");
//
//        int result = 0;
//        int j;
//        for (int i = letters.length - 1; i >= 0; i--) {
//            j = i - 1;
//            int value1 = map.get(letters[i]);
//
//            int value2 = j < 0 ? 0 : map.get(letters[j]);
//            int part;
//
//            if (value2 < value1) {
//                i--;
//                part = value1 - value2;
//            } else {
//                part = value1;
//            }
//
//            result += part;
//        }
//
//        return result;
//    }
//
    private Map<String, Integer> initMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        return map;
    }

}
