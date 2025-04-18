package com.interviewbit.programming.string;

public class ReverseTheString {
    private static final char WHITESPACE = ' ';

    public String solve(String input) {
        final StringBuilder builder = new StringBuilder();

        int wordLength = 0;
        for (int cursor = input.length() - 1; cursor >= 0; cursor--) {
            char character = input.charAt(cursor);
            if (character != WHITESPACE) {
                wordLength++;
                continue;
            }

            if (wordLength == 0) {
                continue;
            }

            appendWord(cursor + 1, wordLength, builder, input);
            wordLength = 0;
        }

        if (wordLength != 0) {
            appendWord(0, wordLength, builder, input);
        }

        return builder.toString();
    }

    private static void appendWord(int wordStart, int wordLength, StringBuilder builder, String input) {
        if (builder.length() != 0) {
            builder.append(WHITESPACE);
        }
        for (int i = wordStart; i < wordStart + wordLength; i++) {
            builder.append(input.charAt(i));
        }
    }
}
