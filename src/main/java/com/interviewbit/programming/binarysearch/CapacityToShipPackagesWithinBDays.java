package com.interviewbit.programming.binarysearch;

import java.util.ArrayList;

public class CapacityToShipPackagesWithinBDays {
    public int solve(ArrayList<Integer> conveyorBelt, int givenDays) {
        long[] subtotals = new long[conveyorBelt.size()];

        long sum = 0L;
        int maxWeight = 0;
        for (int i = 0; i < conveyorBelt.size(); i++) {
            int weight = conveyorBelt.get(i);

            sum += weight;
            subtotals[i] = sum;

            maxWeight = Math.max(maxWeight, weight);
        }
    }
}
