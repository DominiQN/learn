//package com.interviewbit.programming.string;
//
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class ConvertTheAmountInNumberToWordsTest {
//    private final ConvertTheAmountInNumberToWords convertTheAmountInNumberToWords = new ConvertTheAmountInNumberToWords();
//
//    @ParameterizedTest
//    @CsvSource({
//            "123456789,twelve-crore-thirty-four-lakh-fifty-six-thousand-seven-hundred-and-eighty-nine",
//            "500000,five-lakh",
//            "2100,two-thousand-one-hundred",
//            "2001,two-thousand-and-one",
//    })
//    void pass(final String arabicNumber, final String indianNumber) {
//        int result = convertTheAmountInNumberToWords.solve(arabicNumber, indianNumber);
//        assertThat(result).isEqualTo(1);
//    }
//
//    @ParameterizedTest
//    @CsvSource({
//            "500000,five-lakhs",
//            "0,zero",
//            "2100,two-thousand-and-one-hundred",
//            "2001,two-thousand-one"
//    })
//    void fail(final String arabicNumber, final String indianNumber) {
//        int result = convertTheAmountInNumberToWords.solve(arabicNumber, indianNumber);
//        assertThat(result).isEqualTo(0);
//    }
//}