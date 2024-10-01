package com.interviewbit.programming.bitmanipulation;

import java.util.List;

public class SingleNumberII {

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> list) {
        int[] bitCounter = new int[Integer.SIZE];

        for (int element : list) {
            for (int i = 0; i < bitCounter.length; i++) {
                int bitPosition = 1 << i;
                int bitAnd = element & bitPosition;
                if ((bitAnd) == bitPosition) {
                    bitCounter[i]++;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < bitCounter.length; i++) {
            result += (bitCounter[i] % 3) << i;
        }
        return result;
    }
}
