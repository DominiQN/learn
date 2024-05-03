package com.interviewbit.programming.arrays;

import java.util.ArrayList;
import java.util.TreeMap;

public class OccurrenceOfEachNumber {
    public ArrayList<Integer> findOccurences(ArrayList<Integer> A) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        A.forEach(value -> {
            int count = map.getOrDefault(value, 0);
            map.put(value, count + 1);
        });



        return new ArrayList<>(map.values());
    }
}
