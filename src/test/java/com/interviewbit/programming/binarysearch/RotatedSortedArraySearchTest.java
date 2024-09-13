package com.interviewbit.programming.binarysearch;

import org.junit.jupiter.api.Test;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class RotatedSortedArraySearchTest {
    private final RotatedSortedArraySearch rotatedSortedArraySearch = new RotatedSortedArraySearch();

    @Test
    void ex1() {
        int result = rotatedSortedArraySearch.search(listOf(4, 5, 6, 7, 0, 1, 2, 3), 4);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void ex2() {
        int result = rotatedSortedArraySearch.search(listOf(5, 17, 100, 3), 6);
        assertThat(result).isEqualTo(-1);
    }
}
