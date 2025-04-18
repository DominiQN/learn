package com.interviewbit.programming.linkedlist;

public class InsertionSortList {

// 제출은 이거
//    public ListNode insertionSortList(ListNode node) {
//        ListNode head = new ListNode(Integer.MIN_VALUE);
//        head.next = node;
//
//        ListNode prevCursor = head;
//        ListNode cursor = head.next;
//
//        while (cursor != null) {
//            ListNode nextCursor = cursor.next;
//
//            ListNode prevIndex = head;
//            ListNode currentIndex = head.next;
//
//            while (currentIndex != cursor && currentIndex.val <= cursor.val) {
//                prevIndex = currentIndex;
//                currentIndex = currentIndex.next;
//            }
//
//            if (currentIndex == cursor) {
//                // 커서 이동
//                prevCursor = cursor;
//                cursor = nextCursor;
//                continue;
//            }
//
//            // 삽입 로직
//            prevIndex.next = cursor;
//            cursor.next = currentIndex;
//
//            // 삽입으로 빠진 링크 연결
//            prevCursor.next = nextCursor;
//
//            // prevCursor는 그대로임
//            // 커서 이동
//            cursor = nextCursor;
//        }
//
//        return head.next;
//    }

    // 석태님 코드 보고 수정
    public ListNode insertionSortList(ListNode node) {
        // 이거 하나 만들면 각종 null check 안 해도 됨
        ListNode head = new ListNode(Integer.MIN_VALUE);
        head.next = node;

        ListNode prevCursor = head;
        ListNode cursor = head.next;

        while (cursor != null) {
            ListNode nextCursor = cursor.next;

            ListNode i = head;

            while (i.next.val < cursor.val) {
                i = i.next;
            }

            // a,  b,  c,  d,  e
            //     ^   ^
            //     |   |
            //     |   |
            //     i   cursor(= i.next)
            // 현재 커서까지 도달하면 스킵
            if (i.next == cursor) {
                // 커서 이동
                prevCursor = cursor;
                cursor = nextCursor;
                continue;
            }

            // 현재 커서 도달 전이면 현재 커서를 해당 위치에 삽입
            cursor.next = i.next;
            i.next = cursor;

            // 현재 커서가 빠져 끊어진 링크 연결
            prevCursor.next = nextCursor;

            // 커서 이동
            cursor = nextCursor;
        }

        return head.next;
    }
}

