package com.interviewbit.programming.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SpiralOrderMatrixTest {
    private final SpiralOrderMatrix spiralOrderMatrix = new SpiralOrderMatrix();

    @Test
    void example() {
        int[][] given = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[] expected = {1, 2, 3, 6, 9, 8, 7, 4, 5};

        int[] actual = spiralOrderMatrix.spiralOrder(given);

        assertThat(actual).containsExactly(expected);
    }

    @Test
    void case4x4() {
        int[][] given = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int[] expected = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};

        int[] actual = spiralOrderMatrix.spiralOrder(given);

        assertThat(actual).containsExactly(expected);
    }

    @Test
    void case10x8() {
        int[][] given = {
            {1, 2, 3, 4, 5, 6, 7, 8},
            {9, 10, 11, 12, 13, 14, 15, 16},
            {17, 18, 19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30, 31, 32},
            {33, 34, 35, 36, 37, 38, 39, 40},
            {41, 42, 43, 44, 45, 46, 47, 48},
            {49, 50, 51, 52, 53, 54, 55, 56},
            {57, 58, 59, 60, 61, 62, 63, 64},
            {65, 66, 67, 68, 69, 70, 71, 72},
            {73, 74, 75, 76, 77, 78, 79, 80}
        };

        int[] expected = {
                1, 2, 3, 4, 5, 6, 7, 8,
                16, 24, 32, 40, 48, 56, 64, 72,
                80, 79, 78, 77, 76, 75, 74, 73,
                65, 57, 49, 41, 33, 25, 17, 9,
                10, 11, 12, 13, 14, 15, 23, 31,
                39, 47, 55, 63, 71, 70, 69, 68,
                67, 66, 58, 50, 42, 34, 26, 18,
                19, 20, 21, 22, 30, 38, 46, 54,
                62, 61, 60, 59, 51, 43, 35, 27,
                28, 29, 37, 45, 53, 52, 44, 36
        };

        int[] actual = spiralOrderMatrix.spiralOrder(given);

        assertThat(actual).containsExactly(expected);
    }
}
