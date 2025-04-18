package com.interviewbit.programming.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerToRomanTest {
    private final IntegerToRoman integerToRoman = new IntegerToRoman();

    @ParameterizedTest
    @CsvSource({
            "3, III",
            "4, IV",
            "9, IX",
            "58, LVIII",
            "19, XIX",
    })
    void ex(final int given, final String expected) {
        final String actual = integerToRoman.intToRoman(given);
        assertThat(actual).isEqualTo(expected);
    }
}