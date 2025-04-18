package com.interviewbit.programming.binarysearch;

import java.util.ArrayList;

public class CapacityToShipPackagesWithinBDays {
    public int solve(ArrayList<Integer> conveyorBelt, int givenDays) {
        long[] subtotals = new long[conveyorBelt.size()];

        int maxWeight = 0;
        long sum = 0L;
        for (int i = 0; i < conveyorBelt.size(); i++) {
            int weight = conveyorBelt.get(i);

            sum += weight;
            subtotals[i] = sum;

            maxWeight = Math.max(maxWeight, weight);
        }

        long low = maxWeight;
        long high = sum;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (canShip(mid, subtotals, givenDays)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) low;
    }

    private boolean canShip(long capacity, long[] subtotals, int givenDays) {
//        int low = 0;
//        int high = subtotals.length - 1;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            long midVal = subtotals[mid];
//
//            if (midVal < capacity) {
//                high = mid - 1;
//            } else if (midVal > capacity)
//        }
        return false;
    }
}
