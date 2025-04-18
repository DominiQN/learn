package com.interviewbit.programming.string;

public class IntegerToRoman {
    public String intToRoman(int value) {
        StringBuilder builder = new StringBuilder();

        for (Romans roman : Romans.values()) {
            int count = value / roman.integer;

            for (int i = 0; i < count; i++) {
                builder.append(roman);
            }

            value %= roman.integer;
        }

        assert value == 0;

        return builder.toString();
    }

    private enum Romans {
        M(1000),
        CM(900),
        D(500),
        CD(400),
        C(100),
        XC(90),
        L(50),
        XL(40),
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1),
        ;

        final int integer;

        Romans(int integer) {
            this.integer = integer;
        }
    }
}
