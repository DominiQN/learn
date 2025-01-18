package com.interviewbit.programming.twopointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class Array3PointersTest {
    private final Array3Pointers array3Pointers = new Array3Pointers();

    @Test
    void ex1() {
        List<Integer> listA = listOf(1, 4, 10);
        List<Integer> listB = listOf(2, 15, 20);
        List<Integer> listC = listOf(10, 12);

        final int result = array3Pointers.minimize(listA, listB, listC);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void emptyArray() {
        List<Integer> listA = listOf();
        List<Integer> listB = listOf(2, 15, 20);
        List<Integer> listC = listOf(10, 12);

        final int result = array3Pointers.minimize(listA, listB, listC);

        assertThat(result).isEqualTo(Integer.MAX_VALUE);
    }

    @Test
    void sameArray() {
        List<Integer> listA = listOf(1);
        List<Integer> listB = listOf(1);
        List<Integer> listC = listOf(1);

        final int result = array3Pointers.minimize(listA, listB, listC);

        assertThat(result).isEqualTo(0);
    }
}
