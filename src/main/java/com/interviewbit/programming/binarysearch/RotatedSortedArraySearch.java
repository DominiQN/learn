package com.interviewbit.programming.binarysearch;

import java.util.List;

public class RotatedSortedArraySearch {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int search(final List<Integer> list, int target) {
        int base = findBaseIndex(list);
        int listSize = list.size();

        int low = 0;
        int high = listSize - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = list.get(correct(base, mid, listSize));
            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return correct(base, mid, listSize);
        }
        return -1;
    }

    private int findBaseIndex(final List<Integer> list) {
        int low = 0;
        int high = list.size() - 1;
        int lowVal = list.get(low);
        int highVal = list.get(high);

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = list.get(mid);

            if (lowVal > midVal) {
                high = mid - 1;
                highVal = midVal;
            } else if (midVal > highVal) {
                low = mid + 1;
                lowVal = list.get(low);
            } else {
                return low;
            }
        }
        return low;
    }

    private int correct(int base, int index, int listSize) {
        return (base + index) % listSize;
    }
}
// 0 1 2 3 4 5 6 7 8 9
//[0 1 2 3 4 5 6 7 8 9]
//         0 <= 4  4 <= 9 -> return low
//
// 0 1 2 3 4 5 6 7 8 9
//[3,4,5,6,7,8,9,0,1,2]
//
//         //mid를 제외
//         0 9  4  0 <= 4  4 > 9 -> low = mid + 1
//         5 9  7  5 > 7 -> high = mid
//         5 7  6  5 <= 6  6 > 7 -> low = mid + 1
//         7 7  7  7 = 7 -> return low
//
//
// 0 1 2 3 4 5 6 7 8 9
//[8,9,0,1,2,3,4,5,6,7]
//
//        0 9  4  0 > 4 -> high = mid
//        0 4  2  0 > 2 -> high = mid
//        0 2  1  0 <= 1  1 > 2 -> low = mid + 1
//        2 2
