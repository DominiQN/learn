package com.interviewbit.programming.linkedlist;

import com.interviewbit.programming.utils.ListNode;
import org.junit.jupiter.api.Test;

import static com.interviewbit.programming.utils.ListNodeUtils.node;
import static com.interviewbit.programming.utils.ListNodeUtils.toList;
import static org.assertj.core.api.Assertions.assertThat;

class EvenReverseTest {
    private final EvenReverse evenReverse = new EvenReverse();

    @Test
    void ex1() {
        ListNode given = node(1, 2, 3, 4);

        ListNode result = evenReverse.solve(given);

        assertThat(toList(result)).containsExactly(1, 4, 3, 2);
    }

    @Test
    void ex2() {
        ListNode given = node(1, 2, 3);

        ListNode result = evenReverse.solve(given);

        assertThat(toList(result)).containsExactly(1, 2, 3);
    }

    @Test
    void ex3() {
        ListNode given = node(1);

        ListNode result = evenReverse.solve(given);

        assertThat(toList(result)).containsExactly(1);
    }
}
