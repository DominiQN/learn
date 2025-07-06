package com.interviewbit.programming.backtracking;

import com.interviewbit.programming.utils.ListNode;

public class ReverseLinkListRecursion {
    public ListNode reverseList(ListNode node) {
        return reverse(null, node);
    }

    private ListNode reverse(ListNode prev, ListNode current) {
        ListNode next = current.next;

        current.next = prev;

        if (next == null) {
            return current;
        }

        return reverse(current, next);
    }
}
