package com.interviewbit.programming.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ZigzagStringTest {
    private final ZigzagString zigzagString = new ZigzagString();

    @ParameterizedTest
    @CsvSource({
            "PAYPALISHIRING, 3, PAHNAPLSIIGYIR",
            "ABCD, 2, ACBD",
            "B, 1, B"
    })
    void name(String given, int rows, String expected) {
        final String result = zigzagString.convert(given, rows);
        assertThat(result).isEqualTo(expected);
    }
}
