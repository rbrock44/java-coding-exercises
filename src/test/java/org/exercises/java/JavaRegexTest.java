package org.exercises.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JavaRegexTest {
    @ParameterizedTest
    @CsvSource({
        "000.12.12.034,true",
        "121.234.12.12,true",
        "23.45.12.56,true",
        "00.12.123.123123.123,false",
        "122.23,false",
        "Hello.IP,false",
    })
    void worksAsExpected(String ip, Boolean expected) {
        String[] args = Stream.of(ip).toArray(String[]::new);

        assertEquals(expected, JavaRegex.main(args));
    }
}
