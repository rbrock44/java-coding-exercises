package org.exercises.java;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class JavaCurrencyFormatterTest {
    @ParameterizedTest
    @CsvSource(value = {
        "12324.134!US: $12,324.13/India: Rs.12,324.13/China: ￥12,324.13/France: 12 324,13 €"
    }, delimiter = '!')
    void worksAsExpected(Double payment, String expected) {
        String[] expectedOutput = expected.split("/");
        assertArrayEquals(expectedOutput, JavaCurrencyFormatter.main(payment));
    }
}
