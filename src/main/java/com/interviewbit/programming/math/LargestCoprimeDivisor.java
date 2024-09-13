package com.interviewbit.programming.math;

import java.util.HashSet;
import java.util.Set;

public class LargestCoprimeDivisor {
    private final Set<String> memo = new HashSet<>();

    public int cpFact(int a, int b) {
        assert a > 0;
        assert b > 0;

        int current = Math.max(a, b);

        while (a % current != 0 || !isCoprime(current, b)) {
            current--;
        }

        return current;
    }

    private boolean isCoprime(int a, int b) {
        if (memo.contains(key(a, b))) {
            return false;
        }
        return gcd(a, b) == 1;
    }

    private int gcd(int a, int b) {
        Set<String> keys = new HashSet<>();

        int larger = a >= b ? a : b;
        int smaller = a < b ? a : b;

        String initialKey = key(larger, smaller);
        keys.add(initialKey);

        while (larger != smaller && smaller > 1) {
            int diff = larger - smaller;

            if (diff > smaller) {
                larger = diff;
            } else {
                larger = smaller;
                smaller = diff;
            }

            keys.add(key(larger, smaller));
        }

        if (smaller != 1) {
            memo.addAll(keys);
        }
        return smaller;
    }

    private String key(int large, int small) {
        return large + "," + small;
    }
}
