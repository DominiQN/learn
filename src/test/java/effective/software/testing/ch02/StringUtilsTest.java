package effective.software.testing.ch02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static effective.software.testing.ch02.StringUtils.substringsBetween;
import static org.assertj.core.api.Assertions.assertThat;

class StringUtilsTest {
    // str가 null이면 null을 반환한다.
    // str가 empty면 []를 반환
    // open이 null이면?
    // close가 null이면?
    // open이 empty면 null 반환
    // close가 empty면 null 반환
    // nested 구조라면?
    // open과 close가 같은 문자열이면?
    // open과 close 사이에 아무런 문자가 없으면 "" 요소를 array에 담아 반환


    @DisplayName("책 input 예제를 넣었을 때, 정상 동작하는지 테스트")
    @Test
    void passCase() {
        // given
        final String str = "axcaycazc";
        final String open = "a";
        final String close = "c";

        // when
        final String[] result = substringsBetween(str, open, close);

        // then
        assertThat(result).containsExactly("x", "y", "z");
    }

    @DisplayName("open과 close에 1개 이상의 길이를 가진 토큰일 때도 동작하는지")
    @Test
    void openCloseStringMoreThan1Char() {
        // given
        final String str = "abcdeabdefgab123e";
        final String open = "ab";
        final String close = "e";

        // when
        final String[] result = substringsBetween(str, open, close);

        // then
        assertThat(result).containsExactly("cd", "d", "123");
    }

    // T1
    @ParameterizedTest
    @NullSource
    void strIsNull(final String str) {
        assertThat(substringsBetween(str, "a", "b")).isNull();
    }

    // T2
    @ParameterizedTest
    @EmptySource
    void strIsEmpty(final String str) {
        assertThat(substringsBetween(str, "a", "b")).isEqualTo(new String[0]);
    }

    // T3, T4
    @ParameterizedTest
    @NullAndEmptySource
    void openIsNullOrEmpty(final String open) {
        assertThat(substringsBetween("abc", open, "c")).isNull();
    }

    // T5, T6
    @ParameterizedTest
    @NullAndEmptySource
    void closeIsNullOrEmpty(final String close) {
        assertThat(substringsBetween("abc", "a", close)).isNull();
    }

    @DisplayName("str 길이가 1인 경우에는 null을 반환한다.")
    @ParameterizedTest(name = "{0}, str=[{1}], open=[{2}], close=[{3}]")
    @CsvSource({
            // T7
            "str이 open만 포함하는 경우, b, b, c",
            // T8
            "str이 close만 포함하는 경우, c, b, c",
            // T9
            "str이 open과 close 둘 다 포함하지 않는 경우, a, b, c",
            // T10
            "str이 open과 close를 모두 포함하는 경우(open=close), a, a, a",
    })
    void strLengthIs1(final String description, final String str, final String open, final String close) {
        assertThat(substringsBetween(str, open, close)).isNull();
    }

    // T11, T12, T13
    @DisplayName("open과 close 길이가 1인데, str이 open과 close 중 하나라도 포함하지 않는 경우 null을 반환한다.")
    @ParameterizedTest(name = "[{index}] {arguments}")
    @CsvSource(useHeadersInDisplayName = true, textBlock = """
            '',                                    str, open, close
            str이 open과 close 둘 다 포함하지 않는 경우,  abc, x,    y
            str이 open만 포함하는 경우,                 abc, a,    y
            str이 close만 포함하는 경우,                abc, x,    b
            """)
    void openCloseLengthAre1ButAtLeastOneTagNotContainsInStr(
            final String description,
            final String str,
            final String open,
            final String close
    ) {
        assertThat(substringsBetween(str, open, close)).isNull();
    }

    @DisplayName("open과 close 모두 길이가 1이고, str에 둘 모두가 포함되어 있는 경우")
    @Test
    void openCloseLengthAre1AndBothContainsInStr() {
        // T14 태그 모두를 포함하는 경우
        assertThat(substringsBetween("abc", "a", "c")).containsExactly("b");
        // T15 태그 모두를 여러 번 포함하는 경우
        assertThat(substringsBetween("abcabc", "a", "c")).containsExactly("b", "b");
        // str에 공백 문자 추가
        assertThat(substringsBetween("abcax y zc", "a", "c")).containsExactly("b", "x y z");
    }

    // T16, T17, T18
    @DisplayName("open과 close 길이가 1 이상인데, str이 open과 close 중 하나라도 포함하지 않는 경우 null을 반환한다.")
    @ParameterizedTest(name = "[{index}] {arguments}")
    @CsvSource(useHeadersInDisplayName = true, textBlock = """
            '',                                    str, open, close
            str이 open과 close 둘 다 포함하지 않는 경우,  aabcc, xx,    yy
            str이 open만 포함하는 경우,                 aabcc, aa,    yy
            str이 close만 포함하는 경우,                aabcc, xx,    cc
            """)
    void openCloseLengthAreMoreThan1ButAtLeastOneTagNotContainsInStr(
            final String description,
            final String str,
            final String open,
            final String close
    ) {
        assertThat(substringsBetween(str, open, close)).isNull();
    }

    @DisplayName("open과 close 모두 길이가 1 이상이고, str에 둘 모두가 포함되어 있는 경우")
    @Test
    void openCloseLengthAreMoreThan1AndBothContainsInStr() {
        // T19 태그 모두를 포함하는 경우
        assertThat(substringsBetween("aabcc", "aa", "cc")).containsExactly("b");
        // T20 태그 모두를 여러 번 포함하는 경우
        assertThat(substringsBetween("aabccaabcc", "aa", "cc")).containsExactly("b", "b");
        // open과 close에 공백 문자 추가
        assertThat(substringsBetween("a abc ca abc c", "a a", "c c")).containsExactly("b", "b");
    }

    // T21
    @DisplayName("open과 close 사이의 부분 문자열이 비어 있는 경우, 해당 부분은 빈 문자열을 반환한다.")
    @Test
    void substringBetweenTagIsEmpty() {
        assertThat(substringsBetween("aabb", "aa", "bb")).containsExactly("");
        assertThat(substringsBetween("aabbaaxbb", "aa", "bb")).containsExactly("", "x");
    }
}
