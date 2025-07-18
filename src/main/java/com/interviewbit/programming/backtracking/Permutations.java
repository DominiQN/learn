package com.interviewbit.programming.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
    private Integer[] permutation;
    private boolean[] check;

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> numbers) {
        permutation = new Integer[numbers.size()];
        check = new boolean[numbers.size()];
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(factorial(numbers.size()));

        for (int i = 0; i < numbers.size(); i++) {
            generate(numbers, 0, i, result);
        }

        return result;
    }

    private int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private void generate(ArrayList<Integer> numbers, int depth, int index, ArrayList<ArrayList<Integer>> result) {
        if (check[index]) {
            return;
        }

        check[index] = true;

        permutation[depth] = numbers.get(index);

        if (depth < numbers.size() - 1) {
            for (int i = 0; i < numbers.size(); i++) {
                generate(numbers, depth + 1, i, result);
            }
        } else {
            result.add(new ArrayList<>(Arrays.asList(permutation)));
        }

        check[index] = false;
    }
}
