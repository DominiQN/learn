package com.interviewbit.programming.arrays;

public class PascalTriangle {
    public int[][] solve(int level) {
        if (level == 0) {
            return new int[0][];
        }

        int[][] result = new int[level][];

        result[0] = new int[]{1};

        for (int currentLevel = 1; currentLevel < level; currentLevel++) {
            int size = currentLevel + 1;
            int[] current = new int[size];
            int[] previous = result[currentLevel - 1];

            current[0] = 1;
            current[size - 1] = 1;
            for (int i = 1; i < currentLevel; i++) {
                current[i] = previous[i - 1] + previous[i];
            }

            result[currentLevel] = current;
        }

        return result;
    }
}
