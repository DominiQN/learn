package com.interviewbit.programming.stacksandqueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseString {
    public String reverseString(String value) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < value.length(); i++) {
            stack.addLast(value.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.removeLast());
        }

        return sb.toString();
    }
}
