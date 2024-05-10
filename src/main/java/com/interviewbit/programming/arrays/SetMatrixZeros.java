package com.interviewbit.programming.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class SetMatrixZeros {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int rowSize = a.size();
        int colSize = a.get(0).size();

        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                int value = a.get(i).get(j);
                if (value == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        for (int i = 0; i < rowSize; i++) {
            if (zeroRows.contains(i)) {
                for (int j = 0; j < colSize; j++) {
                    a.get(i).set(j, 0);
                }
            } else {
                for (int j = 0; j < colSize; j++) {
                    if (!zeroCols.contains(j)) continue;

                    a.get(i).set(j, 0);
                }
            };
        }
    }
}
