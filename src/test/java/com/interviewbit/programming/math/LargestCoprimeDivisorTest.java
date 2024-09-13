package com.interviewbit.programming.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class LargestCoprimeDivisorTest {
    private final LargestCoprimeDivisor largestCoprimeDivisor = new LargestCoprimeDivisor();

    @ParameterizedTest
    @CsvSource({
            "30, 12, 5",
            "85080894, 570282708, 14180149",
            "778332288, 555687933, 259444096"
    })
    void example(int a, int b, int expected) {
        final int actual = largestCoprimeDivisor.cpFact(a, b);
        assertThat(actual).isEqualTo(expected);
    }
}
