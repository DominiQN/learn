package com.interviewbit.programming.binarysearch;

public class ImplementPowerFunction {
    public int pow(int x, int n, int d) {
        if (x == 0) {
            return 0;
        }

        long remainder = power(x, n, d);
        while (remainder < 0) {
            remainder += d;
        }
        return (int) remainder;
    }

    private long power(int x, int n, int d) {
        if (n == 0) {
            return 1L;
        }

        if (n == 1) {
            return x;
        }

        long powered = power(x, n / 2, d) % d;

        if (n % 2 == 0) {
            return (powered * powered) % d;
        }
        return ((powered * powered) % d * x) % d;
    }
}
