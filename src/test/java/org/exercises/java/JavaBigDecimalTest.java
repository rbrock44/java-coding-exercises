package org.exercises.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JavaBigDecimalTest {
    @ParameterizedTest
    @CsvSource({
        "9,-100:50:0:56.6:90:0.12:.12:02.34:000.000,90:56.6:50:02.34:0.12:.12:0:000.000:-100"
    })
    void worksAsExpected(int n, String s, String expected) {
        String[] sArray = s.split(":");
        String[] expectedArray = expected.split(":");
        String[] args = Stream.concat(
            Stream.of(n + ""),
            Arrays.stream(sArray)
        ).toArray(String[]::new);

        assertArrayEquals(expectedArray, JavaBigDecimal.main(args));
    }
}
