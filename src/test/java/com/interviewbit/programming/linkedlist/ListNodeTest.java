package com.interviewbit.programming.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.interviewbit.programming.linkedlist.ListNodeUtils.node;
import static org.assertj.core.api.Assertions.assertThat;

public class ListNodeTest {
    @DisplayName("내가 만든 nodes() 잘 동작하는지 테스트")
    @Test
    void nodesFunctionTest() {
        Integer[] given = new Integer[] {0, 1, 2, 3, 4, 5};
        ListNode givenNode = node(given);

        ArrayList<Integer> values = new ArrayList<>();
        for (ListNode i = givenNode; i != null; i = i.next) {
            values.add(i.val);
        }
        assertThat(values).containsExactly(given);
    }
}
