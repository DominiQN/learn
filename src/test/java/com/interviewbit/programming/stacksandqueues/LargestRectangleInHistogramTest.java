package com.interviewbit.programming.stacksandqueues;

import org.junit.jupiter.api.Test;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class LargestRectangleInHistogramTest {
    private final LargestRectangleInHistogram largestRectangleInHistogram = new LargestRectangleInHistogram();

    @Test
    void ex1() {
        int result = largestRectangleInHistogram.largestRectangleArea(listOf(2, 1, 5, 6, 2, 3));

        assertThat(result).isEqualTo(10);
    }

    @Test
    void ex2() {
        int result = largestRectangleInHistogram.largestRectangleArea(listOf(2));

        assertThat(result).isEqualTo(2);
    }

    @Test
    void empty() {
        int result = largestRectangleInHistogram.largestRectangleArea(listOf());

        assertThat(result).isEqualTo(0);
    }
}
