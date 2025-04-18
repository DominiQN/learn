package com.interviewbit.programming.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkedListIITest {
    private final ReverseLinkedListII reverseLinkedListII = new ReverseLinkedListII();

    @Test
    void ex1() {
        ListNode node = ListNodeUtils.node(1, 2, 3, 4, 5);

        ListNode result = reverseLinkedListII.reverseBetween(node, 1, 5);

        assertThat(ListNodeUtils.toList(result)).containsExactly(5, 4, 3, 2, 1);
    }

    @Test
    void ex2() {
        ListNode node = ListNodeUtils.node(1, 2, 3, 4, 5);

        ListNode result = reverseLinkedListII.reverseBetween(node, 2, 4);

        assertThat(ListNodeUtils.toList(result)).containsExactly(1, 4, 3, 2, 5);
    }
}
