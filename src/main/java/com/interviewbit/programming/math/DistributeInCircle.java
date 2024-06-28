package com.interviewbit.programming.math;

public class DistributeInCircle {
    public int solve(int A, int B, int C) {
        int result = (A + (C - 1)) % B;
        if (result == 0) {
            return B;
        }
        return result;
    }
}
