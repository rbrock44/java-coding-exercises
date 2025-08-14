package org.exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class JavaSubstringComparisonsTest {
    @ParameterizedTest
    @CsvSource( value = {
        "welcometojava,3,ava:wel",
    })
    void worksAsExpected(String s, int k, String expectedParam) {
        String[] args = new String[2];
        args[0] = s;
        args[1] = k + "";
        String[] expected = expectedParam.split(":");
        assertArrayEquals(expected, JavaSubstringComparisons.main(args));
    }
}
