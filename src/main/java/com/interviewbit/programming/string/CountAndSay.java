package com.interviewbit.programming.string;

public class CountAndSay {
    public String countAndSay(int sequence) {
        String result = "1";
        for (int i = 1; i < sequence; i++) {
            result = countAndSay(result);
        }
        return result;
    }

    private String countAndSay(String result) {
        StringBuilder builder = new StringBuilder();
        char lastChar = result.charAt(0);
        int count = 0;

        for (int i = 0; i < result.length(); i++) {
            char currentChar = result.charAt(i);
            if (currentChar == lastChar) {
                count++;
            } else {
                appendCountCharacter(builder, count, lastChar);

                lastChar = currentChar;
                count = 1;
            }
        }

        appendCountCharacter(builder, count, lastChar);
        return builder.toString();
    }

    private void appendCountCharacter(StringBuilder builder, int count, char character) {
        builder.append(count);
        builder.append(character);
    }
}
