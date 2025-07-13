package com.interviewbit.programming.backtracking;

import java.util.ArrayList;

public class GenerateAllParenthesisII {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>(n * 2);
        char[] chars = new char[n * 2];

        generate(n, n, chars, result);

        return result;
    }

    private void generate(int openCount, int closeCount, char[] chars, ArrayList<String> result) {
        if (openCount <= 0 && closeCount <= 0) {
            result.add(String.valueOf(chars));
            return;
        }

        if (openCount > closeCount) {
            return;
        }

        if (openCount > 0) {
            chars[chars.length - openCount - closeCount] = '(';
            generate(openCount - 1, closeCount, chars, result);
        }

        chars[chars.length - openCount - closeCount] = ')';
        generate(openCount, closeCount - 1, chars, result);
    }
}
