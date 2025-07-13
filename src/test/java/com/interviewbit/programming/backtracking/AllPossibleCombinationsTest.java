package com.interviewbit.programming.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class AllPossibleCombinationsTest {
    private final AllPossibleCombinations allPossibleCombinations = new AllPossibleCombinations();

    @Test
    void ex1() {
        ArrayList<String> result = allPossibleCombinations.specialStrings(listOf("ab", "cd"));
        assertThat(result).containsExactly("ac", "ad", "bc", "bd");
    }

    @Test
    void ex2() {
        ArrayList<String> result = allPossibleCombinations.specialStrings(listOf("aa", "bb"));
        assertThat(result).containsExactly("ab", "ab", "ab", "ab");
    }
}
