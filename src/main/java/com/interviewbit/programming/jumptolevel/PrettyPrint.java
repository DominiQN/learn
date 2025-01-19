package com.interviewbit.programming.jumptolevel;

import java.util.ArrayList;

public class PrettyPrint {
    public ArrayList<ArrayList<Integer>> prettyPrint(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("The argument must be greater than 0.");
        }

        int loop = 2 * size - 1;

        ArrayList<ArrayList<Integer>> result = new ArrayList<>(loop);

        for (int x = -size + 1; x < size; x++) {
            ArrayList<Integer> row = new ArrayList<>(loop);

            for (int y = -size + 1; y < size; y++) {
                row.add(c(x, y));
            }

            result.add(row);
        }

        return result;
    }

    private int c(final int x, final int y) {
        return Math.max(Math.abs(x), Math.abs(y)) + 1;
    }
}
