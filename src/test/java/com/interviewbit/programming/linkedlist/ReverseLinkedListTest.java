package com.interviewbit.programming.linkedlist;

import com.interviewbit.programming.utils.ListNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.interviewbit.programming.utils.ListNodeUtils.node;
import static com.interviewbit.programming.utils.ListNodeUtils.toList;
import static org.assertj.core.api.Assertions.assertThat;

class ReverseLinkedListTest {
    private final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    void ex1() {
        // given
        Integer[] given = new Integer[] {0, 1, 2, 3, 4, 5};
        ListNode givenNode = node(given);

        // when
        ListNode reversedNode = reverseLinkedList.reverseList(givenNode);

        // then
        List<Integer> values = toList(reversedNode);

        assertThat(values).containsExactly(5, 4, 3, 2, 1, 0);
    }

    @Test
    void ex2() {
        // given
        ListNode givenNode = null;

        // when
        ListNode reversedNode = reverseLinkedList.reverseList(givenNode);

        // then

        assertThat(reversedNode).isNull();
    }
}
