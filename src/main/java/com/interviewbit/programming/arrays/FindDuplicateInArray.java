package com.interviewbit.programming.arrays;

import java.util.HashSet;

public class FindDuplicateInArray {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {
        HashSet<Integer> found = new HashSet<>(A.length);

        for (int element : A) {
            if (found.add(element)) {
                return element;
            }
        }

        return -1;
    }
}
