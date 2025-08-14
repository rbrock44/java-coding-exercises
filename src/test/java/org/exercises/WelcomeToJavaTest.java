package org.exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeToJavaTest {
    @ParameterizedTest
    @CsvSource(value = {
        "Hello, World.:Hello, Java."
    }, delimiter = '[')
    void worksAsExpected(String expected) {
        String[] expectedOutput = expected.split(":");
        assertArrayEquals(expectedOutput, WelcomeToJava.main(new String[0]));
    }
}
