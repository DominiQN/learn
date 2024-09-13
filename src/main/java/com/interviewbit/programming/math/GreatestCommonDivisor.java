package com.interviewbit.programming.math;

class GreatestCommonDivisor {
    public int gcd(int a, int b) {
        int larger = a >= b ? a : b;
        int smaller = a < b ? a : b;


        if (smaller == 0) {
            return larger;
        }

        while (larger != smaller && smaller > 1) {
            int diff = larger - smaller;

            if (diff > smaller) {
                larger = diff;
            } else {
                larger = smaller;
                smaller = diff;
            }
        }

        return smaller;
    }
}
