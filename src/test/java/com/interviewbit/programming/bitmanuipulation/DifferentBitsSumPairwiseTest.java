package com.interviewbit.programming.bitmanuipulation;

import com.interviewbit.programming.bitmanipulation.DifferentBitsSumPairwise;
import org.junit.jupiter.api.Test;

import static com.interviewbit.programming.ListUtils.listOf;
import static org.assertj.core.api.Assertions.assertThat;

class DifferentBitsSumPairwiseTest {
    private final DifferentBitsSumPairwise differentBitsSumPairwise = new DifferentBitsSumPairwise();

    @Test
    void ex1() {
        final int result = differentBitsSumPairwise.cntBits(listOf(1, 3, 5));

        assertThat(result).isEqualTo(8);
    }

    @Test
    void ex2() {
        final int result = differentBitsSumPairwise.cntBits(listOf(2, 3));

        assertThat(result).isEqualTo(2);
    }

    @Test
    void bitrep() {
        System.out.println(Integer.toBinaryString(1_000_000_000 + 7));
    }
}
