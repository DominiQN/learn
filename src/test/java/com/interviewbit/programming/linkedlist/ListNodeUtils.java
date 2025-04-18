package com.interviewbit.programming.linkedlist;

import java.util.ArrayList;

public class ListNodeUtils {
    public static ListNode node(Integer... values) {
        if (values.length == 0) {
            return null;
        }

        ListNode firstNode = new ListNode(values[0]);

        ListNode indexNode = firstNode;
        for (int i = 1; i < values.length; i++) {
            ListNode newNode = new ListNode(values[i]);
            indexNode.next = newNode;
            indexNode = newNode;
        }

        return firstNode;
    }

    public static ArrayList<Integer> toList(ListNode node) {
        ArrayList<Integer> values = new ArrayList<>();

        for (ListNode i = node; i != null; i = i.next) {
            values.add(i.val);
        }

        return values;
    }
}
