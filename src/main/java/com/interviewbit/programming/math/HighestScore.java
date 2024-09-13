package com.interviewbit.programming.math;

import java.util.*;

public class HighestScore {
    public int highestScore(ArrayList<ArrayList<String>> A) {
        Map<String, List<Integer>> scoresByName = new HashMap<>();

        for (ArrayList<String> entry : A) {
            String name = entry.get(0);
            int score = Integer.parseInt(entry.get(1));
            scoresByName.compute(name, (key, value) -> {
                if (value == null) {
                    return new ArrayList<>(Collections.singletonList(score));
                }
                value.add(score);
                return value;
            });
        }

        return scoresByName.values().stream().map(scores -> {
            int size = scores.size();
            double sum = 0.0;
            for (int score : scores) {
                sum += score;
            }
            return (int) (sum / size);
        })
                .max(Integer::compareTo)
                .orElse(0);
    }
}
