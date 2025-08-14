package org.exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JavaDatatypesTest {
    @ParameterizedTest
    @CsvSource({
        "5,-150:150000:1500000000:213333333333333333333333333333333333:-100000000000000,-150 can be fitted in:/* short/* int/* long/150000 can be fitted in:/* int/* long/1500000000 can be fitted in:/* int/* long/213333333333333333333333333333333333 can't be fitted anywhere./-100000000000000 can be fitted in:/* long"
    })
    void worksAsExpected(String n, String queriesParam, String expected) {
        String[] queries = queriesParam.split(":");
        String[] args = Stream.concat(
            Stream.of(n),
            Arrays.stream(queries)
        ).toArray(String[]::new);

        String[] expectedQueries = expected.split("/");
        assertArrayEquals(expectedQueries, JavaDatatypes.main(args));
    }
}
