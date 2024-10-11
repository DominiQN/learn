package com.interviewbit.programming.bitmanipulation;

import org.junit.jupiter.api.Test;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class XoringTheSubarraysTest {
    private final XoringTheSubarrays xoringTheSubarrays = new XoringTheSubarrays();

    @Test
    void ex1() {
        final int result = xoringTheSubarrays.solve(listOf(1, 2, 3));
        assertThat(result).isEqualTo(2);
    }

    @Test
    void ex2() {
        final int result = xoringTheSubarrays.solve(listOf(4, 5, 7, 5));
        assertThat(result).isEqualTo(0);
    }
}
