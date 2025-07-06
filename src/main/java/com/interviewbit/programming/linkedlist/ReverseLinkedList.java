package com.interviewbit.programming.linkedlist;

import com.interviewbit.programming.utils.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode node) {
        if (node == null) {
            return null;
        }

        ListNode right = node.next;
        ListNode result = new ListNode(node.val);

        while (right != null) {
            ListNode newNode = new ListNode(right.val);
            newNode.next = result;
            right = right.next;
            result = newNode;
        }

        return result;
    }
}

