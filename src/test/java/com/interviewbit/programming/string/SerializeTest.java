package com.interviewbit.programming.string;

import org.junit.jupiter.api.Test;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class SerializeTest {
    private final Serialize serialize = new Serialize();

    @Test
    void ex1() {
        final String result = serialize.serialize(listOf("scaler", "academy"));
        assertThat(result).isEqualTo("scaler6~academy7~");
    }

    @Test
    void ex2() {
        final String result = serialize.serialize(listOf("interviewbit"));
        assertThat(result).isEqualTo("interviewbit12~");
    }
}
