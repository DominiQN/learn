package com.interviewbit.programming.arrays;

import java.math.BigInteger;
import java.util.ArrayList;

public class FirstMissingInteger {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        long sum = 0;
        BigInteger product = BigInteger.ONE;

        for (int element : A) {
            if (element < 1) {
                continue;
            }
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
            sum += element;
            product = product.multiply(BigInteger.valueOf(element));
            count++;
        }

        if (count == 0 || min > 1) {
            return 1;
        }
        
        long expectedSum = (long) (min + max) * count / 2;

        if (expectedSum == sum) {
            return max + 1;
        }

        long diff = sum - expectedSum;
        

        return 0;
    }
}
