package org.exercises.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JavaStackTest {
    @ParameterizedTest
    @CsvSource({
        "{}(),true",
        "({()}),true",
        "{}(,false",
        "[],true",
        "[{()}],true",
        "({)},false",
        "[[,false",
        "}{,false",
    })
    void worksAsExpected(String a, Boolean expected) {
        String[] args = Stream.of(a).toArray(String[]::new);

        assertEquals(expected, JavaStack.main(args));
    }
}
