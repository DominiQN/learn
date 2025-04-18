package com.interviewbit.programming.twopointers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListIITest {
    private final MergeTwoSortedListII mergeTwoSortedListII = new MergeTwoSortedListII();

    @Test
    void ex1() {
        ArrayList<Integer> a = listOf(1, 5, 8);
        ArrayList<Integer> b = listOf(6, 9);
        mergeTwoSortedListII.merge(a, b);

        assertThat(a).containsExactly(1, 5, 6, 8, 9);
    }
}
