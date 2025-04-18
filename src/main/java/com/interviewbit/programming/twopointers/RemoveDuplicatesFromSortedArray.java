package com.interviewbit.programming.twopointers;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int distinctSize = 0;
        int writeIndex = 0;
        long keepElement = Long.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            final int currentValue = list.get(i);
            if (currentValue == keepElement) {
                continue;
            }

            distinctSize++;

            list.set(writeIndex, currentValue);
            writeIndex++;

            keepElement = currentValue;
        }

        return distinctSize;
    }
}
