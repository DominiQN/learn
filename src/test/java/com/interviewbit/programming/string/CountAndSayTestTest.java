package com.interviewbit.programming.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CountAndSayTestTest {
    private final CountAndSay countAndSay = new CountAndSay();

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,11",
            "3,21",
            "4,1211",
            "5,111221",
            "6,312211"
    })
    void test(int sequence, String expected) {
        final String actual = countAndSay.countAndSay(sequence);

        assertThat(actual).isEqualTo(expected);
    }
}
