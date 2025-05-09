package com.interviewbit.programming.stacksandqueues;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class EvaluateExpressionTest {
    private final EvaluateExpression evaluateExpression = new EvaluateExpression();

    @Test
    void ex1() {
        ArrayList<String> given = listOf("2", "1", "+", "3", "*");
        final int result = evaluateExpression.evalRPN(given);
        assertThat(result).isEqualTo(9);
    }

    @Test
    void ex2() {
        ArrayList<String> given = listOf("4", "13", "5", "/", "+");
        final int result = evaluateExpression.evalRPN(given);
        assertThat(result).isEqualTo(6);
    }
}
