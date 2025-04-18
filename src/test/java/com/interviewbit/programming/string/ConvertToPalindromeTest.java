package com.interviewbit.programming.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ConvertToPalindromeTest {
    private final ConvertToPalindrome convertToPalindrome = new ConvertToPalindrome();

    @ParameterizedTest
    @CsvSource({
            "aa, 1",
            "abcba, 1",
            "bbc, 1",
            "abcde, 0",
            "ab ed ed ba, 1",
            //  ^  ^
            "ab ed o ed  ba, 0",
            //  1     2
            "phmjjmap, 0",
            "iv jw vi, 1",
            //  ^^
            "iph, 0"
    })
    void examples(final String value, int expected) {
        final int result = convertToPalindrome.solve(value);
        assertThat(result).isEqualTo(expected);
    }
}
