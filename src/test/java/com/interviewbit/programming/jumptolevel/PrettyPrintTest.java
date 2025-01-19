package com.interviewbit.programming.jumptolevel;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PrettyPrintTest {
    private final PrettyPrint prettyPrint = new PrettyPrint();

    @Test
    void zero() {
        assertThatThrownBy(() -> {
            prettyPrint.prettyPrint(0);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void argIs3() {
        ArrayList<ArrayList<Integer>> result = prettyPrint.prettyPrint(3);

        assertThat(result).containsExactly(
                listOf(3, 3, 3, 3, 3),
                listOf(3, 2, 2, 2, 3),
                listOf(3, 2, 1, 2, 3),
                listOf(3, 2, 2, 2, 3),
                listOf(3, 3, 3, 3, 3)
        );
    }

    @Test
    void argIs4() {
        ArrayList<ArrayList<Integer>> result = prettyPrint.prettyPrint(4);

        assertThat(result).containsExactly(
                listOf(4, 4, 4, 4, 4, 4, 4),
                listOf(4, 3, 3, 3, 3, 3, 4),
                listOf(4, 3, 2, 2, 2, 3, 4),
                listOf(4, 3, 2, 1, 2, 3, 4),
                listOf(4, 3, 2, 2, 2, 3, 4),
                listOf(4, 3, 3, 3, 3, 3, 4),
                listOf(4, 4, 4, 4, 4, 4, 4)
        );
    }
}
