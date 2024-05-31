package com.interviewbit.programming.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PascalTriangleTest {
    private final PascalTriangle pascalTriangle = new PascalTriangle();

    @Test
    void example1() {
        int[][] result = pascalTriangle.solve(5);

        assertThat(result).isDeepEqualTo(
                new int[][]{
                        new int[]{1},
                        new int[]{1, 1},
                        new int[]{1, 2, 1},
                        new int[]{1, 3, 3, 1},
                        new int[]{1, 4, 6 ,4 ,1}
                }
        );
    }

    @Test
    void example2() {
        int[][] result = pascalTriangle.solve(0);

        assertThat(result).isDeepEqualTo(
                new int[][]{}
        );
    }
}
