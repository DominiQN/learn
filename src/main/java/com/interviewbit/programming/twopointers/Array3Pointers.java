package com.interviewbit.programming.twopointers;

import java.util.List;

public class Array3Pointers {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int minimize(final List<Integer> a, final List<Integer> b, final List<Integer> c) {
        if (a.isEmpty() || b.isEmpty() || c.isEmpty()) {
            return Integer.MAX_VALUE;
        }

        int aMax = Math.max(minimize(a, b), minimize(a, c));
        int bMax = Math.max(minimize(b, a), minimize(b, c));
        int cMax = Math.max(minimize(c, a), minimize(c, b));

        return min(aMax, bMax, cMax);
    }

    private int minimize(final List<Integer> x, final List<Integer> y) {
        int result = Integer.MAX_VALUE;

        for (int target : x) {
            result = Math.min(searchMinimumDistance(target, y), result);
        }

        return result;
    }

    private int searchMinimumDistance(final int target, final List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            int midVal = list.get(mid);

            if (midVal < target) {
                left = mid + 1;
                continue;
            }
            if (target < midVal) {
                right = mid - 1;
                continue;
            }

            return 0;
        }

        int anchor = left;
        int anchorDistance = Math.abs(target - list.get(anchor));

        int anchorLeftDistance;
        if (anchor == 0) {
            anchorLeftDistance = anchorDistance;
        } else {
            anchorLeftDistance = Math.abs(target - list.get(anchor - 1));
        }

        int anchorRightDistance;
        if (anchor == list.size() - 1) {
            anchorRightDistance = anchorDistance;
        } else {
            anchorRightDistance = Math.abs(target - list.get(anchor + 1));
        }

        return min(anchorLeftDistance, anchorDistance, anchorRightDistance);
    }

    private int min(int... values) {
        int result = Integer.MAX_VALUE;

        for (int value : values) {
            result = Math.min(result, value);
        }

        return result;
    }
}
//
/// / 1
//[100, 1000]
//
//left = 0, right = 1, mid = 0, midval = 100
//left = 0, right = 0,
//
//// 10000
//[100, 1000]
//
//left= 0, right = 1, mid = 0, midval = 100
//left = 1, right = 1,
//
//// 500
//[100, 1000]
//
//left = 0, right = 1, mid = 0, midval = 100
//left = 1, right = 1
