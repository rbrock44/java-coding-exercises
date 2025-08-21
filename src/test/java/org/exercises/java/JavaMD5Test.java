package org.exercises.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JavaMD5Test {
    @ParameterizedTest
    @CsvSource({
        "HelloWorld,68e109f0f40ca72a15e05cc22786f8e6",
        "Javarmi123,2da2d1e0ce7b4951a858ed2d547ef485",
    })
    void worksAsExpected(String password, String expected) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String[] args = Stream.of(password).toArray(String[]::new);

        assertEquals(expected, JavaMD5.main(args));
    }
}
