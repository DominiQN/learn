package com.interviewbit.programming.bitmanipulation;

import java.util.ArrayList;

public class DifferentBitsSumPairwise {
    private static final int MODULO = 1_000_000_000 + 7;

    public int cntBits(ArrayList<Integer> list) {
        long result = 0;

        for (int i = 0; i < Integer.SIZE; i++) {
            int flag = 1 << i;

            int count1s = 0;
            for (int value : list) {

                if ((value & flag) == flag) {
                    count1s++;
                }
            }

            int count0s = list.size() - count1s;

            result = (result + (long) count0s * count1s * 2) % MODULO;
        }

        return (int) result;
    }
}
