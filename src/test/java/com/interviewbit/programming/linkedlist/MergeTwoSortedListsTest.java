package com.interviewbit.programming.linkedlist;

import com.interviewbit.programming.utils.ListNode;
import com.interviewbit.programming.utils.ListNodeUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {
    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    void ex1() {
        ListNode a = ListNodeUtils.node(5, 8, 20);
        ListNode b = ListNodeUtils.node(4, 11, 15);

        ListNode result = mergeTwoSortedLists.mergeTwoLists(a, b);

        assertThat(ListNodeUtils.toList(result)).containsExactly(4, 5, 8, 11, 15, 20);
    }
}
