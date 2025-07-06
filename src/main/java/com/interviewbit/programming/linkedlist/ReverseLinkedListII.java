package com.interviewbit.programming.linkedlist;

import com.interviewbit.programming.utils.ListNode;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode node, int from, int to) {
        ListNode head = new ListNode(0);
        head.next = node;

        // 1->2->3->4->5일 때,
        // from이 2라면
        // fromHead는 1이다
        ListNode fromHead = head;
        for (int i = 1; i < from; i++) {
            fromHead = fromHead.next;
        }

        ListNode reversedHead = new ListNode(0);
        ListNode reversedTail = fromHead.next;

        // from 부터 to (이하 서브리스트) 뒤집기
        int range = to - from + 1;
        for (int i = 0; i < range; i++) {
            ListNode index = popNext(fromHead);
            pushNext(reversedHead, index);

        }
        // 뒤집은 서브리스트의 끝과 to 이후의 리스트를 이어주기
        reversedTail.next = fromHead.next;

        // from 시작과, 뒤집은 서브리스트 이어주기
        fromHead.next = reversedHead.next;

        return head.next;
    }

    /**
     * before
     * cursor -> next -> c
     * <br>
     * after
     * cursor -> c
     * return next
     *
     * @param cursor head
     * @return cursor.next
     */
    ListNode popNext(ListNode cursor) {
        ListNode nextNode = cursor.next;
        if (nextNode == null) {
            return null;
        }

        cursor.next = nextNode.next;
        nextNode.next = null;

        return nextNode;
    }

    /**
     *
     * before
     * cursor -> c
     * param next
     * <br>
     * after
     * cursor -> next -> c
     *
     * @param cursor head
     * @param next assigning to cursor.next
     */
    void pushNext(ListNode cursor, ListNode next) {
        ListNode beforeNext = cursor.next;
        cursor.next = next;

        if (next != null) {
            next.next = beforeNext;
        }
    }
}
