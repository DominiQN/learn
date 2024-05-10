package com.interviewbit.programming.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxMinTest {
    private MaxMin maxMin = new MaxMin();

    @Test
    void example1() {
        int[] given = {-2, 1, -4, 5, 3};

        assertThat(maxMin.solve(given)).isEqualTo(1);
    }

    @Test
    void example2() {
        int[] given = {1, 3, 4, 1};

        assertThat(maxMin.solve(given)).isEqualTo(5);
    }
}