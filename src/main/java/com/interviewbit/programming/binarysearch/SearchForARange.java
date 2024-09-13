package com.interviewbit.programming.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchForARange {

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> searchRange(final List<Integer> list, int target) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = list.get(mid);

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return determineRange(low, mid, high, target, list); // key found
        }

        return new ArrayList<>(Arrays.asList(-1, -1));
    }

    private ArrayList<Integer> determineRange(int low, int anchor, int high, int target, List<Integer> list) {
        int lowerMid = anchor;
        int higherMid = anchor;

        // low 정하기
        while (low <= lowerMid) {
            int mid = (low + lowerMid) / 2;
            int midVal = list.get(mid);

            if (midVal < target) {
                low = mid + 1;
            } else {
                lowerMid = mid - 1;
            }
        }

        // high 정하기
        while (higherMid <= high) {
            int mid = (high + higherMid) / 2;
            int midVal = list.get(mid);

            if (midVal > target) {
                high = mid - 1;
            } else {
                higherMid = mid + 1;
            }
        }

        return new ArrayList<>(Arrays.asList(low, high));
    }
}
