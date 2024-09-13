package com.interviewbit.programming.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseIntegerTest {
    private final ReverseInteger reverseInteger = new ReverseInteger();

    @ParameterizedTest
    @CsvSource({
            "123, 321",
            "-123, -321",
            "2147483647, 0"
    })
    void example(int input, int expected) {
        final int output = reverseInteger.otherSolution(input);

        assertThat(output).isEqualTo(expected);
    }
}