package com.interviewbit.programming.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class AddOneToNumberTest {
    private static Stream<Arguments> provideExamples() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 4}),
                Arguments.of(new int[]{0, 1, 2, 3}, new int[]{1, 2, 4}),
                Arguments.of(new int[]{9, 9, 9}, new int[]{1, 0, 0, 0})
        );
    }

    private AddOneToNumber addOneToNumber = new AddOneToNumber();

    @ParameterizedTest
    @MethodSource("provideExamples")
    void add(int[] input, int[] output) {
        assertThat(addOneToNumber.plusOne(input)).containsExactly(output);
    }
}