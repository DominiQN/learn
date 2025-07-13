package com.interviewbit.programming.backtracking;

import java.util.ArrayList;

public class AllPossibleCombinations {
    public ArrayList<String> specialStrings(ArrayList<String> givenList) {
        char[] chars = new char[givenList.size()];
        ArrayList<String> result = new ArrayList<>();

        backtrack(givenList, 0, chars, result);

        return result;
    }

    private void backtrack(ArrayList<String> givenList, int currentIndex, char[] chars, ArrayList<String> result) {
        if (currentIndex >= givenList.size()) {
            result.add(String.valueOf(chars));
            return;
        }

        String currentString = givenList.get(currentIndex);

        for (int i = 0; i < currentString.length(); i++) {
            chars[currentIndex] = currentString.charAt(i);
            backtrack(givenList, currentIndex + 1, chars, result);
        }
    }
}
