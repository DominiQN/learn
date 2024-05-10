package com.interviewbit.programming.arrays;

import java.util.Arrays;

public class MaxMin {
    public int solve(int[] A) {
        int[] sortedArray = Arrays.stream(A).sorted().toArray();
        int min = sortedArray[0];
        int max = sortedArray[sortedArray.length - 1];
        return min + max;
    }
}
