package com.interviewbit.programming.linkedlist;

public class EvenReverse {
    public ListNode solve(ListNode node) {
        ListNode oddHead = new ListNode(0);
        oddHead.next = node;
        ListNode evenHead = new ListNode(0);
        boolean isEven = true;

        for (ListNode i = oddHead; i.next != null; i = i.next) {
            if (isEven) {
                isEven = false;
                continue;
            }

            ListNode temp = i.next;
            i.next = temp.next;

            temp.next = evenHead.next;
            evenHead.next = temp;

            if (i == null) {
                break;
            }

            isEven = true;
        }

        ListNode resultHead = new ListNode(0);

        for (ListNode i = resultHead, target = oddHead.next, other = evenHead.next; target != null;) {
            i.next = target;
            target = other;
            other = i.next.next;
            i = i.next;
        }

        return resultHead.next;
    }
}
