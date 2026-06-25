package com.kkukielka.exercise;

import java.util.*;

public class PascalTriangle {

    Map<Integer, List<Integer>> tab = new HashMap<>();

    public List<List<Integer>> generate(int numRows) {
        if (numRows > 0) {
            tab.put(1, Collections.singletonList(1));
        }
        if (numRows > 1) {
            tab.put(2, Arrays.asList(1, 1));
        }
        sum(numRows);
        List<List<Integer>> list = new ArrayList<>(tab.values());

        return list;
    }

    private List<Integer> sum(int numRows) {


        List<Integer> list = tab.get(numRows);
        if (list != null) {
            return list;
        } else {
            list = new ArrayList<>();
        }

        list.add(1);

        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> prev;
            if (tab.get(numRows) == null) {
                prev = sum(numRows - 1);
            } else {
                prev = tab.get(numRows);
            }
            int left = prev.get(i);
            int right = 0;
            if (i + 1 < prev.size()) {
                right = prev.get(i + 1);
            }
            int result = left + right;
            list.add(result);
        }

        tab.put(numRows, list);
        return list;
    }
}

//     1
//   1   1
//  1  2   1
// 1  3  3  1