package com.interviewbit.programming.stacksandqueues;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FirstNonRepeatingCharacterInAStreamOfCharactersTest {
    private final FirstNonRepeatingCharacterInAStreamOfCharacters firstNonRepeatingCharacterInAStreamOfCharacters = new FirstNonRepeatingCharacterInAStreamOfCharacters();

    @ParameterizedTest
    @CsvSource({
        "abadbc,aabbdd",
        "abcabc,aaabc#"
    })
    void ex1(final String given, final String expected) {
        final String result = firstNonRepeatingCharacterInAStreamOfCharacters.solve(given);

        assertThat(result).isEqualTo(expected);
    }
}
