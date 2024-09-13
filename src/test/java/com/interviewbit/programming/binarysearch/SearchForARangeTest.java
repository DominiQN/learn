package com.interviewbit.programming.binarysearch;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class SearchForARangeTest {
    private final SearchForARange searchForARange = new SearchForARange();

    @Test
    void example1() {
        final ArrayList<Integer> result = searchForARange.searchRange(unmodifiableListOf(5, 7, 7, 8, 8, 10), 8);

        assertThat(result).containsExactly(3, 4);
    }

    @Test
    void example2() {
        final ArrayList<Integer> result = searchForARange.searchRange(unmodifiableListOf(5, 17, 100, 111), 3);

        assertThat(result).containsExactly(-1, -1);
    }

    @Test
    void example3() {
        final ArrayList<Integer> result = searchForARange.searchRange(unmodifiableListOf(1), 1);

        assertThat(result).containsExactly(0, 0);
    }

    private List<Integer> unmodifiableListOf(Integer... value) {
        return Collections.unmodifiableList(listOf(value));
    }
}
