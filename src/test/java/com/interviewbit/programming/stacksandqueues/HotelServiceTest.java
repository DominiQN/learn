package com.interviewbit.programming.stacksandqueues;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class HotelServiceTest {
    private final HotelService hotelService = new HotelService();

    @Test
    void ex1() {
        ArrayList<Integer> result = hotelService.nearestHotel(
                listOf(
                        listOf(0, 0),
                        listOf(1, 0)
                ),
                listOf(
                        listOf(1, 1),
                        listOf(2, 1),
                        listOf(1, 2)
                )
        );

        assertThat(result).containsExactly(1, 0, 2);
    }

    @Test
    void ex2() {
        ArrayList<Integer> result = hotelService.nearestHotel(
                listOf(listOf(1, 0, 0, 1)),
                listOf(listOf(1, 2), listOf(1, 3))
        );

        assertThat(result).containsExactly(1, 1);
    }
}
