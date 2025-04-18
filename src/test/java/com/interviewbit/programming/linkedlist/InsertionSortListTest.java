package com.interviewbit.programming.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.interviewbit.programming.linkedlist.ListNodeUtils.node;
import static com.interviewbit.programming.linkedlist.ListNodeUtils.toList;
import static org.assertj.core.api.Assertions.assertThat;

class InsertionSortListTest {
    private final InsertionSortList insertionSortList = new InsertionSortList();

    @Test
    void ex1() {
        // given
        ListNode first = node(1, 3, 2);

        // when
        ListNode result = insertionSortList.insertionSortList(first);

        // then
        List<Integer> resultList = toList(result);
        assertThat(resultList).containsExactly(1, 2, 3);
    }

    @Test
    void ex2() {
        // given
        ListNode first = node(5, 66, 68, 42, 73, 25, 84, 63, 72, 20, 77, 38, 8, 99, 92, 49, 74, 45, 30, 51, 50, 95, 56, 19, 31, 26, 98, 67, 100, 2, 24, 6, 37, 69, 11, 16, 61, 23, 78, 27, 64, 87, 3, 85, 55, 22, 33, 62);

        // when
        ListNode result = insertionSortList.insertionSortList(first);

        // then
        List<Integer> resultList = toList(result);
        assertThat(resultList).containsExactly(2, 3, 5, 6, 8, 11, 16, 19, 20, 22, 23, 24, 25, 26, 27, 30, 31, 33, 37, 38, 42, 45, 49, 50, 51, 55, 56, 61, 62, 63, 64, 66, 67, 68, 69, 72, 73, 74, 77, 78, 84, 85, 87, 92, 95, 98, 99, 100);
    }

    @Test
    void givenNull() {
        // given
        ListNode first = null;

        // when
        ListNode result = insertionSortList.insertionSortList(first);

        // then
        assertThat(result).isNull();
    }
}
