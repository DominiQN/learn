package com.interviewbit.programming.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class GridUniquePathsTest {
    private final GridUniquePaths gridUniquePaths = new GridUniquePaths();

    @ParameterizedTest
    @CsvSource({
//            "1, 1, 1",
//            "2, 2, 2",
//            "3, 3, 6",
//            "100, 1, 1",
            "15, 9, 319770"
    })
    void examples(int a, int b, int expected) {
        final int actual = gridUniquePaths.uniquePaths(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
