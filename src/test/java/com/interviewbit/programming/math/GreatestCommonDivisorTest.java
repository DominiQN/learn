package com.interviewbit.programming.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class GreatestCommonDivisorTest {
    private final GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();

    @ParameterizedTest
    @CsvSource({
            "9, 6, 3",
            "6, 9, 3",
            "10, 4, 2",
            "13, 1, 1",
            "4, 6, 2",
            "2, 0, 2",
            "0, 0, 0"
    })
    void example(int a, int b, int expected) {
        int actual = greatestCommonDivisor.gcd(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
