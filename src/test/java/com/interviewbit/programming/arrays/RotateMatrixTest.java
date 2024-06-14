package com.interviewbit.programming.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class RotateMatrixTest {
    private final RotateMatrix rotateMatrix = new RotateMatrix();

    @Test
    void example1() {
        ArrayList<ArrayList<Integer>> given = listOf(
                listOf(1, 2),
                listOf(3, 4)
        );
        rotateMatrix.rotate(given);

        assertThat(given).isEqualTo(
                listOf(
                        listOf(3, 1),
                        listOf(4, 2)
                )
        );
    }

    @Test
    void example2() {
        ArrayList<ArrayList<Integer>> given = listOf(
                listOf(1)
        );
        rotateMatrix.rotate(given);

        assertThat(given).isEqualTo(
                listOf(
                        listOf(1)
                )
        );
    }

    @Test
    void myExample() {
        ArrayList<ArrayList<Integer>> given = listOf(
                listOf(1, 2, 3),
                listOf(4, 5, 6),
                listOf(7, 8, 9)
        );
        rotateMatrix.rotate(given);

        assertThat(given).isEqualTo(
                listOf(
                        listOf(7, 4, 1),
                        listOf(8, 5, 2),
                        listOf(9, 6, 3)
                )
        );
    }
}
