package com.interviewbit.programming.linkedlist;

import org.junit.jupiter.api.Test;

import static com.interviewbit.programming.linkedlist.ListNodeUtils.node;
import static com.interviewbit.programming.linkedlist.ListNodeUtils.toList;
import static org.assertj.core.api.Assertions.assertThat;

class AddTwoNumbersAsListsTest {
    private final AddTwoNumbersAsLists addTwoNumbersAsLists = new AddTwoNumbersAsLists();

    @Test
    void ex1() {
        ListNode a = node(2, 4, 3);
        ListNode b = node(5, 6, 4);

        ListNode result = addTwoNumbersAsLists.addTwoNumbers(a, b);
        assertThat(toList(result)).containsExactly(7, 0, 8);
    }

    @Test
    void ex2() {
        ListNode a = node(2, 4);
        ListNode b = node(5, 6, 4);

        ListNode result = addTwoNumbersAsLists.addTwoNumbers(a, b);
        assertThat(toList(result)).containsExactly(7, 0, 5);
    }

    @Test
    void ex3() {
        ListNode a = node(1);
        ListNode b = node(9, 9, 9);

        ListNode result = addTwoNumbersAsLists.addTwoNumbers(a, b);
        assertThat(toList(result)).containsExactly(0, 0, 0, 1);
    }

    @Test
    void ex4() {
        ListNode a = node(0);
        ListNode b = node(0);

        ListNode result = addTwoNumbersAsLists.addTwoNumbers(a, b);
        assertThat(toList(result)).containsExactly(0);
    }
}
