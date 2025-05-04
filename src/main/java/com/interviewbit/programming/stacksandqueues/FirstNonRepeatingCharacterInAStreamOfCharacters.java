package com.interviewbit.programming.stacksandqueues;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeatingCharacterInAStreamOfCharacters {
    public String solve(String stream) {
        Set<Character> occurrence = new HashSet<>();
        LinkedHashSet<Character> queue = new LinkedHashSet<>();

        StringBuilder result = new StringBuilder(stream.length());

        for (char c : stream.toCharArray()) {
            boolean firstOccurred = occurrence.add(c);

            if (firstOccurred) {
                queue.add(c);
            } else {
                queue.remove(c);
            }

            Iterator<Character> iterator = queue.iterator();
            if (iterator.hasNext()) {
                result.append(iterator.next());
            } else {
                result.append('#');
            }
        }

        return result.toString();
    }
}
