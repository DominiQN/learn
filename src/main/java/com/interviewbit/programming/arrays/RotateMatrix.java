package com.interviewbit.programming.arrays;

import java.util.ArrayList;

public class RotateMatrix {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int length = a.size();
        int max = length - 1;

        for (int x = 0; x < length / 2; x++) {
            for (int y = x; y < max - x; y++) {
                swap(a, x, y, y, max - x);
                swap(a, x, y, max - x, max - y);
                swap(a, x, y, max - y, x);
            }
        }
    }

    private void swap(ArrayList<ArrayList<Integer>> matrix, int aX, int aY, int bX, int bY) {
        int temp = matrix.get(aX).get(aY);
        matrix.get(aX).set(aY, matrix.get(bX).get(bY));
        matrix.get(bX).set(bY, temp);
    }
}
