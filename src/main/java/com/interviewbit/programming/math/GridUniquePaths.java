package com.interviewbit.programming.math;

public class GridUniquePaths {
    public int uniquePaths(int a, int b) {

        int r = (Math.min(a, b) - 1);
        int n = (Math.max(a, b) - 1) + r;

        return (int) (factorial(n, n - r) / factorial(r, 0));
    }

    private long factorial(int start, int until) {
        long result = 1;

        if (start < 2) {
            return result;
        }

        for (int i = start; i > until; i--) {
            result *= i;
        }
        return result;
    }
}
