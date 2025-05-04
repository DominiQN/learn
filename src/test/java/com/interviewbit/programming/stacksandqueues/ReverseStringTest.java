package com.interviewbit.programming.stacksandqueues;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
    private final ReverseString reverseString = new ReverseString();

    @Test
    void ex1() {
        final String result = reverseString.reverseString("abc");

        assertThat(result).isEqualTo("cba");
    }
}
