package com.interviewbit.programming.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SetMatrixZerosTest {
    private SetMatrixZeros setMatrixZeros = new SetMatrixZeros();

    @Test
    void example1() {
        ArrayList<ArrayList<Integer>> given = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(1, 0 ,1)),
                        new ArrayList<>(Arrays.asList(1, 1 ,1)),
                        new ArrayList<>(Arrays.asList(1, 1 ,1))
                )
        );

        setMatrixZeros.setZeroes(given);

        assertThat(given).containsExactly(
                new ArrayList<>(Arrays.asList(0, 0, 0)),
                new ArrayList<>(Arrays.asList(1, 0, 1)),
                new ArrayList<>(Arrays.asList(1, 0, 1))
        );
    }

    @Test
    void example2() {
        ArrayList<ArrayList<Integer>> given = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(1, 0 ,1)),
                        new ArrayList<>(Arrays.asList(1, 1 ,1)),
                        new ArrayList<>(Arrays.asList(1, 0 ,1))
                )
        );

        setMatrixZeros.setZeroes(given);

        assertThat(given).containsExactly(
                new ArrayList<>(Arrays.asList(0, 0, 0)),
                new ArrayList<>(Arrays.asList(1, 0, 1)),
                new ArrayList<>(Arrays.asList(0, 0, 0))
        );
    }
}