package com.interviewbit.programming.arrays;

import java.util.ArrayList;

public class AddOneToNumber {
    public int[] plusOne(int[] A) {
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 1;
        int mostSignificantDigit = 0;

        for (int i = 0; i < A.length; i++) {
            int prev = A[(A.length - 1) - i];
            int next = prev + carry;

            if (next > 9) {
                carry = 1;
                result.add(0);
            } else {
                carry = 0;
                result.add(next);
            }

            if (result.get(i) != 0) {
                mostSignificantDigit = i;
            }
        }

        if (carry != 0) {
            result.add(carry);
            mostSignificantDigit = result.size() - 1;
        }

        int[] ret = new int[mostSignificantDigit + 1];
        for (int i = 0; i < ret.length; i++) {
            ret[(ret.length - 1) - i] = result.get(i);
        }

        return ret;
    }
}
