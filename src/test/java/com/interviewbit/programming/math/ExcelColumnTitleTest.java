package com.interviewbit.programming.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ExcelColumnTitleTest {
    private final ExcelColumnTitle excelColumnTitle = new ExcelColumnTitle();

    @ParameterizedTest
    @CsvSource({
            "1, A",
            "26, Z",
            "27, AA",
            "28, AB",
            "943566, BAQTZ"
    })
    void examples(int input, String expectedOutput) {
        String actualOutput = excelColumnTitle.convertToTitle(input);

        assertThat(actualOutput).isEqualTo(expectedOutput);
    }
}