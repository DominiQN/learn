package com.interviewbit.programming.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ImplementStrStrTest {
    private final ImplementStrStr implementStrStr = new ImplementStrStr();

    @ParameterizedTest
    @CsvSource({
            "strstr,str,0",
            "bighit,bit,-1",
            "abcabcabcabcabcabcd,abcabcd,12"
    })
    void examples(final String haystack, final String needle, final int expected) {
        int result = implementStrStr.strStr(haystack, needle);
        assertThat(result).isEqualTo(expected);
    }
}
