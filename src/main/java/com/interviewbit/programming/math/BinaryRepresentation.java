package com.interviewbit.programming.math;

public class BinaryRepresentation {
    public String findDigitsInBinary(int A) {
        int decimal = A;

        StringBuilder binary = new StringBuilder();

        do {
            binary.append(decimal % 2);
            decimal = decimal / 2;
        } while (decimal != 0);

        return binary.reverse().toString();
    }
}
