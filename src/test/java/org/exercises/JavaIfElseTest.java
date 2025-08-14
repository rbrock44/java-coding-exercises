package org.exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class JavaIfElseTest {
    @ParameterizedTest
    @CsvSource(value = {
        "3,Weird",
        "24,Not Weird",
        "2,Not Weird",
        "5,Weird",
        "6,Weird",
        "20,Weird"
    })
    void worksAsExpected(String n, String expected) {
        String[] args = new String[1];
        args[0] = n;
        assertEquals(expected, JavaIfElse.main(args));
    }
}
