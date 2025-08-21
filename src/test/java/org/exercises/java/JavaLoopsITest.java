package org.exercises.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class JavaLoopsITest {
    @ParameterizedTest
    @CsvSource({
        "2,2 x 1 = 2:2 x 2 = 4:2 x 3 = 6:2 x 4 = 8:2 x 5 = 10:2 x 6 = 12:2 x 7 = 14:2 x 8 = 16:2 x 9 = 18:2 x 10 = 20"
    })
    void worksAsExpected(String n, String expectedParam) {
        String[] args = new String[1];
        args[0] = n;
        String[] expected = expectedParam.split(":");
        assertArrayEquals(expected, JavaLoopsI.main(args));
    }
}
