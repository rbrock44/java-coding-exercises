package org.exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaDateAndTimeTest {
    @ParameterizedTest
    @CsvSource({
        "8,14,2017,MONDAY",
        "8,5,2015,WEDNESDAY",
        "8,14,2025,THURSDAY"
    })
    void worksAsExpected(int month, int day, int year, String expected) {
        assertEquals(expected, JavaDateAndTime.findDay(month, day, year));
    }
}
