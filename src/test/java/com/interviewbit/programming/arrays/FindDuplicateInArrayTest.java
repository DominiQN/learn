package com.interviewbit.programming.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindDuplicateInArrayTest {
    private final FindDuplicateInArray findDuplicateInArray = new FindDuplicateInArray();

    @Test
    void example1() {
        int[] input = new int[]{3, 4, 1, 4, 2};
        int output = findDuplicateInArray.repeatedNumber(input);
        assertThat(output).isEqualTo(4);
    }

    @Test
    void example2() {
        int[] input = new int[]{1, 2, 3};
        int output = findDuplicateInArray.repeatedNumber(input);
        assertThat(output).isEqualTo(-1);
    }

    @Test
    void example3() {
        int[] input = new int[]{3, 4, 1, 4, 1};
        int output = findDuplicateInArray.repeatedNumber(input);
        assertThat(output).isIn(1, 4);
    }
}