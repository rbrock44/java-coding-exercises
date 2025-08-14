package org.exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class JavaSubstringTest {
    @ParameterizedTest
    @CsvSource(value = {
        "Helloworld,3,7,lowo"
    })
    void worksAsExpected(String s, int start, int end, String expected) {
        String[] args = new String[3];
        args[0] = s;
        args[1] = start + "";
        args[2] = end + "";
        assertEquals(expected, JavaSubstring.main(args));
    }
}
