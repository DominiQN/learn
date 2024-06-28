package com.interviewbit.programming.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class DistributeInCircleTest {
    private DistributeInCircle distributeInCircle = new DistributeInCircle();

    @ParameterizedTest
    @CsvSource({
            "2, 5, 1, 2",
            "8, 5, 2, 4",
            "5, 5, 1, 5"
    })
    void test(int a, int b, int c, int expected) {
        int actual = distributeInCircle.solve(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }
}
