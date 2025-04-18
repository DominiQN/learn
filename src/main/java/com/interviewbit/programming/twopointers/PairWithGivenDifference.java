package com.interviewbit.programming.twopointers;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class PairWithGivenDifference {
    public int solve(ArrayList<Integer> list, int difference) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int value : list) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        if (difference == 0) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    return 1;
                }
            }
        } else {
            for (int value : list) {
                if (map.containsKey(value + difference)) {
                    return 1;
                }
            }
        }

        return 0;
    }
}
