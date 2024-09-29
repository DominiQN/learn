package com.interviewbit.programming.bitmanipulation;

import java.util.List;

public class SingleNumber {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> list) {
        int result = 0;

        for (int element : list) {
            result ^= element;
        }

        return result;
    }
}
