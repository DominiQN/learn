package com.interviewbit.programming.string;

import java.util.ArrayList;

public class Serialize {

    public String serialize(ArrayList<String> list) {
        StringBuilder builder = new StringBuilder();

        for (String token : list) {
            builder
                .append(token)
                .append(token.length())
                .append("~");
        }

        return builder.toString();
    }
}
