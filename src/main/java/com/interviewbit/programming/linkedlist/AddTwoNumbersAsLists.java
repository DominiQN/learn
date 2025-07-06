package com.interviewbit.programming.linkedlist;

import com.interviewbit.programming.utils.ListNode;

public class AddTwoNumbersAsLists {
//    // memory efficient
//    public ListNode addTwoNumbers(ListNode a, ListNode b) {
//        int carry = 0;
//
//        ListNode resultHead = new ListNode(0);
//        ListNode resultCurrent = resultHead;
//
//        while (a != null || b != null || carry > 0) {
//            ListNode current = null;
//
//            // a 처리
//            if (a != null) {
//                current = a;
//                a = a.next;
//            }
//
//            // b 처리
//            if (b != null) {
//                if (current == null) {
//                    current = b;
//                } else {
//                    current.val += b.val;
//                }
//
//                b = b.next;
//            }
//
//            // carry 처리
//            if (current == null) {
//                current = new ListNode(carry);
//            } else {
//                current.val += carry;
//            }
//            carry = 0;
//
//            if (current.val >= 10) {
//                current.val -= 10;
//                carry = 1;
//            }
//
//            resultCurrent.next = current;
//            resultCurrent = current;
//        }
//
//        return resultHead.next;
//    }

    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        int carry = 0;

        ListNode resultHead = new ListNode(0);
        ListNode resultCurrent = resultHead;

        while (a != null || b != null || carry > 0) {
            ListNode current = new ListNode(carry);
            carry = 0;

            if (a != null) {
                current.val += a.val;
                a = a.next;
            }

            if (b != null) {
                current.val += b.val;
                b = b.next;
            }

            if (current.val >= 10) {
                carry = 1;
                current.val -= 10;
            }

            resultCurrent.next = current;
            resultCurrent = current;
        }

        return resultHead.next;
    }
}
