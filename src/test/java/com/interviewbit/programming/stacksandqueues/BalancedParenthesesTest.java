package com.interviewbit.programming.stacksandqueues;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class BalancedParenthesesTest {
    private final BalancedParentheses balancedParentheses = new BalancedParentheses();

    @ParameterizedTest
    @CsvSource({
            "(), 1",
            "(()()), 1",
            "((), 0",
    })
    void ex1(String parentheses, int solve) {
        assertThat(balancedParentheses.solve(parentheses)).isEqualTo(solve);
    }
}
