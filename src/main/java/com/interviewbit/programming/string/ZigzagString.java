package com.interviewbit.programming.string;

public class ZigzagString {

    public String convert(String value, int rows) {
        if (rows == 1) {
            return value;
        }
        
        StringBuilder builder = new StringBuilder();
        
        int routine = (rows - 1) * 2;

        for (int row = 0; row < rows; row++) {
            int remainder = row % (rows - 1);
            int additionalStep = (rows - 1 - remainder) * 2;

            for (int i = row; i < value.length(); i += routine) {
                builder.append(value.charAt(i));

                if (remainder != 0 && i + additionalStep < value.length()) {
                    builder.append(value.charAt(i + additionalStep));
                }
            }
        }

        return builder.toString();
    }
}
