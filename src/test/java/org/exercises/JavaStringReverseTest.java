package org.exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class JavaStringReverseTest {
    @ParameterizedTest
    @CsvSource(value = {
        "madam,Yes",
        "anythingelse,No"
    })
    void worksAsExpected(String s, String expected) {
        String[] args = new String[3];
        args[0] = s;
        assertEquals(expected, JavaStringReverse.main(args));
    }
}
