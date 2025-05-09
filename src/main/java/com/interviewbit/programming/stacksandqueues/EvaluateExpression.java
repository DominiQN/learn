package com.interviewbit.programming.stacksandqueues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class EvaluateExpression {
    public int evalRPN(ArrayList<String> expression) {
        Deque<Integer> stack = new ArrayDeque<>();

        int a;
        int b;
        for (String symbol : expression) {
            switch (symbol) {
                case "+":
                    b = stack.removeLast();
                    a = stack.removeLast();
                    stack.addLast(a + b);
                    break;
                case "-":
                    b = stack.removeLast();
                    a = stack.removeLast();
                    stack.addLast(a - b);
                    break;
                case "*":
                    b = stack.removeLast();
                    a = stack.removeLast();
                    stack.addLast(a * b);
                    break;
                case "/":
                    b = stack.removeLast();
                    a = stack.removeLast();
                    stack.addLast(a / b);
                    break;
                default:
                    stack.addLast(Integer.valueOf(symbol));
            }
        }

        return stack.removeLast();
    }
}
