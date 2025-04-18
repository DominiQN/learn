package com.interviewbit.programming.stacksandqueues;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SimplifyDirectoryPathTest {
    private final SimplifyDirectoryPath simplifyDirectoryPath = new SimplifyDirectoryPath();

    @ParameterizedTest
    @CsvSource({
            "/../, /",
            "/home/, /home",
            "/a/./b/../../c/, /c",
            "/home//foo/, /home/foo"
    })
    void ex(String given, String simplified) {
        assertThat(simplifyDirectoryPath.simplifyPath(given)).isEqualTo(simplified);
    }
}
