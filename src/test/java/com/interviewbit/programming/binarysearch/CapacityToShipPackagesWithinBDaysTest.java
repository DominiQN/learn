package com.interviewbit.programming.binarysearch;

import org.junit.jupiter.api.Test;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class CapacityToShipPackagesWithinBDaysTest {
    private final CapacityToShipPackagesWithinBDays capacityToShipPackagesWithinBDays = new CapacityToShipPackagesWithinBDays();

    @Test
    void ex1() {
        int leastCapacityOfShip = capacityToShipPackagesWithinBDays.solve(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5);

        assertThat(leastCapacityOfShip).isEqualTo(15);
    }

    @Test
    void ex2() {
        int leastCapacityOfShip = capacityToShipPackagesWithinBDays.solve(listOf(3, 2, 2, 4, 1, 4), 3);

        assertThat(leastCapacityOfShip).isEqualTo(6);
    }
}
