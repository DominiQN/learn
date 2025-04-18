package com.interviewbit.programming.string;

public class ConvertToPalindrome {
    public int solve(String value) {
        if (solve(value, 0, value.length() - 1, true)) {
            return 1;
        }
        return 0;
    }

    private boolean solve(final String value, int left, int right, boolean chance) {
        while (left < right) {
            if (value.charAt(left) == value.charAt(right)) {
                left++;
                right--;
                continue;
            }

            // 문자 제거 찬스가 있으면 사용, 없으면 중단
            if (!chance) {
                return false;
            }

            return solve(value, left + 1, right, false)
                    || solve(value, left, right - 1, false);
        }

        return true;
    }
}
