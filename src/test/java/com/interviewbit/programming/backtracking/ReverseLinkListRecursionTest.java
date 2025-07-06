package com.interviewbit.programming.backtracking;

import com.interviewbit.programming.utils.ListNode;
import com.interviewbit.programming.utils.ListNodeUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkListRecursionTest {
    private final ReverseLinkListRecursion reverseLinkListRecursion = new ReverseLinkListRecursion();

    @Test
    void ex1() {
        ListNode node = ListNodeUtils.node(1, 2, 3, 4, 5);

        ListNode result = reverseLinkListRecursion.reverseList(node);

        assertThat(ListNodeUtils.toList(result)).containsExactly(5, 4, 3, 2, 1);
    }
}
