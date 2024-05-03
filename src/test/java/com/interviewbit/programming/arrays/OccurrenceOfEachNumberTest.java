package com.interviewbit.programming.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


class OccurrenceOfEachNumberTest {
    private static ArrayList<Integer> listOf(int... numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        return list;
    }

    private OccurrenceOfEachNumber occurrenceOfEachNumber = new OccurrenceOfEachNumber();

    @Test
    void example1() {
        ArrayList<Integer> result = occurrenceOfEachNumber.findOccurences(listOf(1, 2, 3));

        assertThat(result).containsExactly(1, 1, 1);
    }

    @Test
    void example2() {
        ArrayList<Integer> result = occurrenceOfEachNumber.findOccurences(listOf(4, 3, 3));

        assertThat(result).containsExactly(2, 1);
    }

    @Test
    void myExample() {
        ArrayList<Integer> result = occurrenceOfEachNumber.findOccurences(listOf(4, 4, 1, 2, 3, 4, 4, 1));

        assertThat(result).containsExactly(2, 1, 1, 4);
    }
}
