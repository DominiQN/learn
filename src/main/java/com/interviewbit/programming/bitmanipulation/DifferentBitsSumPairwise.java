package com.interviewbit.programming.bitmanipulation;

import java.util.ArrayList;

public class DifferentBitsSumPairwise {
    public int cntBits(ArrayList<Integer> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int diff = sumDiff(list.get(i), list.get(j));
                result += diff;
            }
        }
        return result * 2 % (1_000_000_000 + 7);
    }

    private int sumDiff(int a, int b) {
        int xor = a ^ b;
        return Integer.bitCount(xor);
    }
}
