package com.interviewbit.programming.backtracking;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MaximalStringTest {
    private final MaximalString maximalString = new MaximalString();

    @ParameterizedTest
    @CsvSource({
            "254, 1, 524",
            "254, 2, 542",
            "451299, 2, 991254",
            "541299, 2, 991254"
    })
    void test(String value, int chance, String expected) {
        String actual = maximalString.solve(value, chance);

        assertThat(actual).isEqualTo(expected);
    }
}
