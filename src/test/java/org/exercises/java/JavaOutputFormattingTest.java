package org.exercises.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class JavaOutputFormattingTest {
    @ParameterizedTest
    @CsvSource(value = {
        "java 100:cpp 65:python 50,================================:java           100:cpp            065:python         050:================================"
    })
    void worksAsExpected(String argsParams, String expectedParams) {
        String[] args = argsParams.split(":");
        String[] expected = expectedParams.split(":");
        assertArrayEquals(expected, JavaOutputFormatting.main(args));
    }
}
