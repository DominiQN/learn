package com.interviewbit.programming.backtracking;

public class MaximalString {
    private char[] maxChars;

    /**
     * char in value conatins only digits from 0 to 9.
     * 1 <= value.length() <= 9
     * 1 <= chance <= 5
     */
    public String solve(String value, int maxChance) {
        char[] chars = value.toCharArray();
        maxChars = value.toCharArray();

        for (int chance = 1; chance <= maxChance; chance++) {
            findMaxChars(chars, 0, chance);
        }

        return String.valueOf(maxChars);
    }

    private void findMaxChars(char[] chars, int current, int chance) {
        if (current == chance && isGreaterThanMax(chars)) {
            copyToMaxChars(chars);
            return;
        }

        for (int i = current + 1; i < chars.length; i++) {
            swap(chars, current, i);
            findMaxChars(chars, current + 1, chance);
            swap(chars, current, i);
        }
    }

    private void copyToMaxChars(char[] chars) {
        System.arraycopy(chars, 0, maxChars, 0, chars.length);
    }

    private void swap(char[] chars, int a, int b) {
        char keep = chars[a];
        chars[a] = chars[b];
        chars[b] = keep;
    }

    private boolean isGreaterThanMax(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > maxChars[i]) {
                return true;
            }
            if (chars[i] < maxChars[i]) {
                return false;
            }
        }
        return false;
    }
}
