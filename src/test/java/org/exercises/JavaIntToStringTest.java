package org.exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaIntToStringTest {

    @ParameterizedTest
    @CsvSource(value = {
        "100, Good job",
        "bad, Wrong answer"
    })
    void worksAsExpected(String value, String expected) {
        String[] args = new String[1];
        args[0] = value;
        assertEquals(expected, JavaIntToString.main(args));
    }

}
