package com.interviewbit.programming.linkedlist;

import com.interviewbit.programming.utils.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode head = new ListNode(0);
        ListNode index = head;

        ListNode high;
        ListNode low;

        if (a.val < b.val) {
            high = b;
            low = a;
        } else {
            high = a;
            low = b;
        }

        while (low != null) {
            index.next = low;
            index = low;

            if (high == null) {
                low = low.next;
                continue;
            }

            if (low.next == null) {
                low = high;
                high = null;
                continue;
            }

            if (low.next.val <= high.val) {
                low = low.next;
            } else {
                ListNode temp = low.next;
                low = high;
                high = temp;
            }
        }

        return head.next;
    }
}
