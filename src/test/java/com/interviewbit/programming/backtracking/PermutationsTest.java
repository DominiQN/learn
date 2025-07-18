package com.interviewbit.programming.backtracking;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class PermutationsTest {
    private final Permutations permutations = new Permutations();

    @Test
    void ex1() {
        ArrayList<ArrayList<Integer>> result = permutations.permute(listOf(1, 2, 3));

        assertThat(result).containsExactly(
                listOf(1,2,3),
                listOf(1,3,2),
                listOf(2,1,3),
                listOf(2,3,1),
                listOf(3,1,2),
                listOf(3,2,1)
        );
    }
}
