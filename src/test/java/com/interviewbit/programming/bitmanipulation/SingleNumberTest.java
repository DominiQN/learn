package com.interviewbit.programming.bitmanipulation;

import org.junit.jupiter.api.Test;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberTest {
    private final SingleNumber singleNumber = new SingleNumber();

    @Test
    void ex1() {
        int result = singleNumber.singleNumber(listOf(1, 2, 2, 3, 1));

        assertThat(result).isEqualTo(3);
    }

    @Test
    void ex2() {
        int result = singleNumber.singleNumber(listOf(1, 2, 2));

        assertThat(result).isEqualTo(1);
    }
}
