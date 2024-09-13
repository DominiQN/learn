package com.interviewbit.programming.binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ImplementPowerFunctionTest {
    private final ImplementPowerFunction implementPowerFunction = new ImplementPowerFunction();

    @ParameterizedTest
    @CsvSource({
            "2,3,3,2",
            "5,2,6,1",
            "-1,1,20,19",
            "79161127,99046373,57263970,47168647"
    })
    void examples(int x, int n, int d, int expected) {
        final int actual = implementPowerFunction.pow(x, n, d);

        assertThat(actual).isEqualTo(expected);
    }
}
