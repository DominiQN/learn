package com.interviewbit.programming.string;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ReverseTheStringTest {
    private final ReverseTheString reverseTheString = new ReverseTheString();

    @Test
    void reverse() {
        assertAll(
                () -> assertThat(reverseTheString.solve("the sky is blue")).isEqualTo("blue is sky the"),
                () -> assertThat(reverseTheString.solve("this is ib")).isEqualTo("ib is this")
        );
    }

    @Test
    void trimStart() {
        assertThat(reverseTheString.solve(" Hello world")).isEqualTo("world Hello");
    }

    @Test
    void trimEnd() {
        assertThat(reverseTheString.solve("Hello world ")).isEqualTo("world Hello");
    }

    @Test
    void trimMultiSpaceBetweenWords() {
        assertThat(reverseTheString.solve("Hello  world")).isEqualTo("world Hello");
    }

    @Disabled
    @ParameterizedTest
    @ValueSource(chars = {' ', '\t', '\n', '\r'})
    void whitespaceChars(char c) {
        String input = "Hello" + c + "world";
        assertThat(reverseTheString.solve(input)).isEqualTo("world Hello");
    }
}
