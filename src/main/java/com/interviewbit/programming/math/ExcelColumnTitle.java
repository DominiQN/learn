package com.interviewbit.programming.math;

public class ExcelColumnTitle {
    private static final int ALPHABET_LENGTH = 26;

    public String convertToTitle(int input) {
        final StringBuilder builder = new StringBuilder();

        for (int q = input; q > 0; q = (q - 1) / ALPHABET_LENGTH) {
            builder.append(convertToAlphabet((q - 1) % ALPHABET_LENGTH));
        }

        return builder.reverse().toString();
    }

    private char convertToAlphabet(int index) {
        return (char) ('A' + index);
    }
}
