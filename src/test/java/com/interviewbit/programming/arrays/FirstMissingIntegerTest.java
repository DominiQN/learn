package com.interviewbit.programming.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class FirstMissingIntegerTest {
    private FirstMissingInteger firstMissingInteger = new FirstMissingInteger();

    @Test
    void example1() {
        ArrayList<Integer> given = new ArrayList<>(Arrays.asList(1, 2, 0));
        int result = firstMissingInteger.firstMissingPositive(given);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void example2() {
        ArrayList<Integer> given = new ArrayList<>(Arrays.asList(3, 4, -1, 1));
        int result = firstMissingInteger.firstMissingPositive(given);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void example3() {
        ArrayList<Integer> given = new ArrayList<>(Arrays.asList(-8, -7, -6));
        int result = firstMissingInteger.firstMissingPositive(given);

        assertThat(result).isEqualTo(1);
    }
}