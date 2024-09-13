package com.interviewbit.programming.math;

import java.util.ArrayList;

public class RearrangeArray {
    /**
     * 0x0000_ffff == 0b_0000_0000_0000_1111_1111_1111_1111
     *
     * 일단 제시한 constraints 1번이, N이 0 이상 50,000 이하이고, integer (2^32) 의 절반 값인 2^16은 65,536이니까
     * integer의 비트 절반 공간만으로도 N 값을 저장할 수 있습니다.
     *
     * 기존에 array에 주어진 값은, 0x00000000 <= value <= 0x0000ffff 이므로
     * 하위 16 비트(0x????0000 <= value <= 0x????ffff)는 기존 값 (givenValue)으로 두고,
     * 상위 16 비트(0x0001???? <= value <= 0xffff????)는 결과 값 (resultValue)로 사용하기로 결정하였습니다.
     */
    private static final int VALUE_MASK = 0x0000ffff;

    public void arrange(ArrayList<Integer> array) {
        for (int index = 0; index < array.size(); index++) {
            int givenValue = parseGivenValue(array.get(index));
            int resultValue = parseGivenValue(array.get(givenValue));
            array.set(index, concatResultValue(resultValue, givenValue));
        }

        array.replaceAll(this::parseResultValue);
    }

    /**
     * 기존 값을 조회할 때는 하위 16비트만 필요하므로,
     * 상위 16비트가 무슨 값이 존재하든 무시해야 합니다.
     *
     * 따라서 bit 연산자 AND (&)를 사용하여, 상위 비트를 모두 0으로 만들어버립니다.
     */
    private int parseGivenValue(int value) {
        return value & VALUE_MASK;
    }

    /**
     * 결과 값을 조회할 때는 상위 16비트만 필요하므로,
     * 하위 16비트가 무슨 값이 존재하든 무시하고, 상위 16비트로 integer를 만들어야 합니다.
     *
     * 예를 들어, 0x12345678 과 같이 저장되어 있으면, 상위 비트 1234만 관심있으므로,
     * 위 값을 0x00005678 로 만들어야 합니다.
     *
     * 1. 먼저 상위 16비트로 integer를 만들기 위해서 오른쪽으로 16비트 옮깁니다. (`>> 16`)
     * 그런데 `>>` 연산자는 최상위부호가 0이면 빈 공간을 0으로 채우고, 1이면 빈 공간을 1로 채웁니다.
     * 만약 양수면 0으로 채우고, 음수면 1로 채운다는 의미입니다.
     *
     * 2. 우리 입장에서는 둘 모두 양수로 간주해야 하므로, 채워지는 비트를 모두 0으로 만들어야 합니다.
     * 따라서 VALUE_MASK와 연산자 AND (&)를 사용하여, 상위 비트를 모두 0으로 만들어버립니다.
     */
    private int parseResultValue(int value) {
        return (value >> 16) & VALUE_MASK;
    }

    /**
     * 결과 값(resultValue) 을 상위 16비트에 저장해야 합니다.
     *
     * 예를 들어 resultValue가 0x00001234이고 givenValue가 0x00005678 이라면,
     * 0x12345678 로 만들어야 합니다.
     *
     * 1. 먼저, resulValue을 `<<` 연산자를 이용하여 왼쪽으로 16비트 옮깁니다. (`<< 16)
     * `>>`와 달리 `<<` 연산자는 빈 공간을 항상 0으로 채우므로, 부호에 신경 쓸 필요가 없습니다.
     *
     * 예시 기준으로는, resultValueUpperBit는 0x12340000 과 같은 형태가 됩니다.
     *
     * 2. 두 값을 합쳐야 하므로, bit 연산자 OR (|)를 이용하여 합쳐줍니다.
     *
     */
    private int concatResultValue(int resultValue, int givenValue) {
        int resultValueUpperBit = resultValue << 16;
        return resultValueUpperBit | givenValue;
    }
}
