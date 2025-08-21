package org.exercises.algorithms;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueensAttackIITest {
    @ParameterizedTest
    @CsvSource({
        "4 0,4 4,p,9",
        "5 3,4 3,5 5:4 2:2 3,10",
        "1 0,1 1,p,0",
    })
    void worksAsExpected(String nAndK, String queen, String obstacles, int expected) {
        String[] args = Stream.concat(
            Stream.concat(Stream.of(nAndK), Stream.of(queen)),
            Stream.of(obstacles.equals("p") ? "" : obstacles)
        ).toArray(String[]::new);

        assertEquals(expected, QueensAttackII.main(args));
    }
}
