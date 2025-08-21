package org.exercises.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaAnagramsTest {
    @ParameterizedTest
    @CsvSource({
        "anagram,margana,Anagrams",
        "cat,ACT,Anagrams",
        "Hello,hello,Anagrams",
        "anagram,argana,Not Anagrams",
        "ab,abXY,Not Anagrams",
    })
    void worksAsExpected(String a, String b, String expected) {
        String[] args = Stream.concat(
            Stream.of(a),
            Stream.of(b)
        ).toArray(String[]::new);

        assertEquals(expected, JavaAnagrams.main(args));
    }
}
