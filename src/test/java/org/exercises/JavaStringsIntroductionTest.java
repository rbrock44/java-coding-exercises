package org.exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class JavaStringsIntroductionTest {
    @ParameterizedTest
    @CsvSource( value = {
        "hello,java,9:No:Hello Java",
        "java,hello,9:Yes:Java Hello"
    })
    void worksAsExpected(String a, String b, String expectedParam) {
        String[] args = new String[2];
        args[0] = a;
        args[1] = b;
        String[] expected = expectedParam.split(":");
        assertArrayEquals(expected, JavaStringsIntroduction.main(args));
    }
}
