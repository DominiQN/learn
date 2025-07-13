package com.interviewbit.programming.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class GenerateAllParenthesisIITest {
    private final GenerateAllParenthesisII generateAllParenthesisII = new GenerateAllParenthesisII();

    @Test
    void ex1() {
        ArrayList<String> result = generateAllParenthesisII.generateParenthesis(3);

        assertThat(result).containsExactly("((()))", "(()())", "(())()", "()(())", "()()()");
    }
}
