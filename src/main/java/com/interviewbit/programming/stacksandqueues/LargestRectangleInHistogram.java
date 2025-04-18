package com.interviewbit.programming.stacksandqueues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(ArrayList<Integer> histogram) {
//        return answer1(histogram);
        return answer2(histogram);
    }

    /**
     * O(width * height)
     */
    private int answer1(ArrayList<Integer> histogram) {

        int top = 0;
        int bottom = Integer.MAX_VALUE;

        for (int height : histogram) {
            if (height > top) {
                top = height;
            }

            if (height < bottom) {
                bottom = height;
            }
        }

        int largestArea = 0;

        for (int level = bottom; level <= top; level++) {
            int maxWidth = 0;
            int currentWidth = 0;

            for (int height : histogram) {
                if (height >= level) {
                    currentWidth++;
                    maxWidth = Math.max(maxWidth, currentWidth);
                } else {
                    currentWidth = 0;
                }
            }

            largestArea = Math.max(largestArea, maxWidth * level);
        }

        return largestArea;
    }

    private int answer2(ArrayList<Integer> histogram) {
        Deque<Integer> stack = new ArrayDeque<>(Collections.singletonList(0));

        int largestArea = 0;

        for (int height : histogram) {
            int last = stack.getLast();
        }

        return 0;
    }
}
