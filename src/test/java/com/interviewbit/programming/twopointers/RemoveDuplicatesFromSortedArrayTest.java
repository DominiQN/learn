package com.interviewbit.programming.twopointers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RemoveDuplicatesFromSortedArrayTest {
    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    void ex1() {
        ArrayList<Integer> given = listOf(1, 1, 2);
        final int result = removeDuplicatesFromSortedArray.removeDuplicates(given);

        assertAll(
                () -> assertThat(result).isEqualTo(2),
                () -> assertThat(given).containsSequence(1, 2)
        );
    }

    @Test
    void ex2() {
        ArrayList<Integer> given = listOf(1, 2, 2, 3, 3);
        final int result = removeDuplicatesFromSortedArray.removeDuplicates(given);

        assertAll(
                () -> assertThat(result).isEqualTo(3),
                () -> assertThat(given).containsSequence(1, 2, 3)
        );
    }

    @Test
    void empty() {
        ArrayList<Integer> given = listOf();
        final int result = removeDuplicatesFromSortedArray.removeDuplicates(given);

        assertAll(
                () -> assertThat(result).isEqualTo(0),
                () -> assertThat(given).isEmpty()
        );
    }

    @Test
    void minValue() {
        ArrayList<Integer> given = listOf(-2147483648, -2147483648, 2);
        final int result = removeDuplicatesFromSortedArray.removeDuplicates(given);

        assertAll(
                () -> assertThat(result).isEqualTo(2),
                () -> assertThat(given).containsSequence(-2147483648, 2)
        );
    }
}
