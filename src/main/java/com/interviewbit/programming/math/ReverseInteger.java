package com.interviewbit.programming.math;

public class ReverseInteger {
    public int reverse(int input) {
        if (input == 0) {
            return 0;
        }

        StringBuilder builder = new StringBuilder();

        builder.append(input).reverse();
        if (input < 0) {
            builder.deleteCharAt(builder.length() - 1);
            builder.insert(0, '-');
        }

        long longValue = Long.parseLong(builder.toString());
        if (longValue > Integer.MAX_VALUE || longValue < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) longValue;
    }

    public int otherSolution(int input) {
        boolean negative = input < 0;
        int power = -1;
        int absoluteInput = Math.abs(input);
        final int[] digits = new int[10];

        for (; absoluteInput > 0 ; absoluteInput /= 10) {
            digits[++power] = absoluteInput % 10;
        }

        int result = 0;
        try {
            for (int multiple = 1, i = power; i > 0; i--, multiple *= 10) {
                result += digits[i] * multiple;
            }
        } catch (ArithmeticException e) {
            return 0;
        }
        return result;
    }
}
