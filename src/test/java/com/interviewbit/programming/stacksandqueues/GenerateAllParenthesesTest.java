package com.interviewbit.programming.stacksandqueues;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class GenerateAllParenthesesTest {
    private final GenerateAllParentheses generateAllParentheses = new GenerateAllParentheses();

    @ParameterizedTest
    @CsvSource({
            "(), 1",
            "(){}[], 1",
            "(], 0",
            "([)], 0"

    })
    void ex1(String parentheses, int isValid) {
        assertThat(generateAllParentheses.isValid(parentheses)).isEqualTo(isValid);
    }
}
