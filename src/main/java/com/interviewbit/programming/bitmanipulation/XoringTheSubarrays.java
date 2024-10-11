package com.interviewbit.programming.bitmanipulation;

import java.util.ArrayList;

public class XoringTheSubarrays {
    public int solve(ArrayList<Integer> list) {
        int result = 0;
        if (list.size() % 2 == 0) {
            return 0;
        }

        for (int i = 0; i < list.size(); i += 2) {
            result ^= list.get(i);
        }
        return result;
    }
}
