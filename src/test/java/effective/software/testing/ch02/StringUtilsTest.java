package effective.software.testing.ch02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
