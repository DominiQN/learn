package com.interviewbit.programming.math;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class RearrangeArrayTest {
    private final RearrangeArray rearrangeArray = new RearrangeArray();

    @Test
    void example1() {
        ArrayList<Integer> given = listOf(1, 0);
        rearrangeArray.arrange(given);

        assertThat(given).containsExactly(0, 1);
    }

    @Test
    void example2() {
        ArrayList<Integer> given = listOf(0, 2, 1, 3);
        rearrangeArray.arrange(given);

        assertThat(given).containsExactly(0, 1, 2, 3);
    }

    @Test
    void example3() {                               // 0, 1, 2, 3, 4, 5, 6, 7, 8
        ArrayList<Integer> given = listOf(1, 3, 8, 5, 5, 8, 3, 5, 0);
        rearrangeArray.arrange(given);

        assertThat(given).containsExactly(3, 5, 0, 8, 8, 0, 5, 8, 1);
    }
}
