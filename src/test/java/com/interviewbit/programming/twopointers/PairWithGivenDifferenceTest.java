package com.interviewbit.programming.twopointers;

import org.junit.jupiter.api.Test;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class PairWithGivenDifferenceTest {
    private final PairWithGivenDifference pairWithGivenDifference = new PairWithGivenDifference();

    @Test
    void ex1() {
        int result = pairWithGivenDifference.solve(listOf(5, 10, 3, 2, 50, 80), 78);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void ex2() {
        int result = pairWithGivenDifference.solve(listOf(-10, 20), 30);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void ex3() {
        int result = pairWithGivenDifference.solve(listOf(-259, -825, 459, 825, 221, 870, 626, 934, 205, 783, 850, 398), -42);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void ex4() {
        int result = pairWithGivenDifference.solve(listOf(2, 2), 0);
        assertThat(result).isEqualTo(1);
    }
}
