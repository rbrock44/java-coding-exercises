package org.exercises.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JavaLoopsIITest {
    @ParameterizedTest
    @CsvSource({
        "2,0 2 10:5 3 5,2 6 14 30 62 126 254 510 1022 2046:8 14 26 50 98"
    })
    void worksAsExpected(String q, String queriesParam, String expected) {
        String[] queries = queriesParam.split(":");
        String[] args = Stream.concat(
            Stream.of(q),
            Arrays.stream(queries)
        ).toArray(String[]::new);

        String[] expectedQueries = expected.split(":");
        assertArrayEquals(expectedQueries, JavaLoopsII.main(args));
    }
}
