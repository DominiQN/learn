package com.interviewbit.programming.math;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class HighestScoreTest {
    private HighestScore highestScore = new HighestScore();

    @Test
    void example1() {
        ArrayList<ArrayList<String>> input = listOf(
                listOf("Bob", "80"),
                listOf("Bob", "90"),
                listOf("Alice", "90")
        );

        int output = highestScore.highestScore(input);

        assertThat(output).isEqualTo(90);
    }

    @Test
    void example2() {
        ArrayList<ArrayList<String>> input = listOf(
                listOf("Bob", "80"),
                listOf("Bob", "90"),
                listOf("Alice", "90"),
                listOf("Alice", "10")
        );

        int output = highestScore.highestScore(input);

        assertThat(output).isEqualTo(85);
    }
}
