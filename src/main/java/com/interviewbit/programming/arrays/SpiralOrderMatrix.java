package com.interviewbit.programming.arrays;

public class SpiralOrderMatrix {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        int rowCursor = 0;
        int colCursor = 0;

        int rowMin = 1;
        int rowMax = A.length - 1;

        int colMin = 0;
        int colMax = A[0].length - 1;

        boolean isRowTurn = false;
        int rowSign = 1;
        int colSign = 1;

        int[] result = new int[A.length * A[0].length];

        for (int resultIndex = 0; resultIndex < result.length; resultIndex++) {
            result[resultIndex] = A[rowCursor][colCursor];

            if (isRowTurn && rowSign > 0) {
                if (rowCursor == rowMax) {
                    rowSign *= -1;
                    rowMax += rowSign;
                    isRowTurn = !isRowTurn;
                    colCursor += colSign;
                } else {
                    rowCursor += rowSign;
                }
            } else if (isRowTurn && rowSign < 0) {
                if (rowCursor == rowMin) {
                    rowSign *= -1;
                    rowMin += rowSign;
                    isRowTurn = !isRowTurn;
                    colCursor += colSign;
                } else {
                    rowCursor += rowSign;
                }
            } else if (!isRowTurn && colSign > 0) {
                if (colCursor == colMax) {
                    colSign *= -1;
                    colMax += colSign;
                    isRowTurn = !isRowTurn;
                    rowCursor += rowSign;
                } else {
                    colCursor += colSign;
                }
            } else if (!isRowTurn && colSign < 0) {
                if (colCursor == colMin) {
                    colSign *= -1;
                    colMin += colSign;
                    isRowTurn = !isRowTurn;
                    rowCursor += rowSign;
                } else {
                    colCursor += colSign;
                }
            }
        }

        return result;
    }
}
