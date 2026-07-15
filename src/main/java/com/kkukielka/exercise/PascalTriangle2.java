package com.kkukielka.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalTriangle2 {

    Map<Integer, List<Integer>> tab = new HashMap<>();

    public List<Integer> getRow(int rowIndex) {
        return sum(rowIndex + 1);
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
