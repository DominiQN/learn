package com.interviewbit.programming.stacksandqueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class GenerateAllParentheses {
    private static final Set<Character> OPEN_PARENTHESES = new HashSet<>(Arrays.asList('(', '{', '['));

    public int isValid(String value) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < value.length(); i++) {
            char current = value.charAt(i);

            if (OPEN_PARENTHESES.contains(current)) {
                stack.addFirst(current);
                continue;
            }

            if (stack.isEmpty()) {
                return 0;
            }
            char top = stack.removeFirst();

            if (top != '(' && current == ')') {
                return 0;
            }

            if (top != '{' && current == '}') {
                return 0;
            }

            if (top != '[' && current == ']') {
                return 0;
            }
        }

        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }
}
