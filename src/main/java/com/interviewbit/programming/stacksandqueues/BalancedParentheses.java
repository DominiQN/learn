package com.interviewbit.programming.stacksandqueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class BalancedParentheses {
    public int solve(String value) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < value.length(); i++) {
            char current = value.charAt(i);

            if (current == '(') {
                stack.addFirst(current);
                continue;
            }

            if (stack.isEmpty()) {
                return 0;
            }
            stack.removeFirst();
        }

        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }
}
