package com.interviewbit.programming.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryRepresentationTest {
    private BinaryRepresentation binaryRepresentation = new BinaryRepresentation();

    @ParameterizedTest
    @CsvSource(
            {
                    "6, 110",
                    "0, 0",
                    "1, 1"
            }
    )
    void test(int input, String expected) {
        String actual = binaryRepresentation.findDigitsInBinary(input);

        assertThat(actual).isEqualTo(expected);
    }
}