package org.assessments;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CodilityTest {
    @ParameterizedTest
    @CsvSource( value = {
        "1:3:6:4:1:2,5",
        "1:2:3,4",
        "-1:-3,1",
    })
    void practiceWorksAsExpected(String list, int expected) {
        int[] args = Arrays.stream(list.split(":")).mapToInt(Integer::parseInt).toArray();
        assertEquals(expected, Codility.practiceSolution(args));
    }

    @ParameterizedTest
    @CsvSource( value = {
        "5,8,2",
        "4,10,4",
        "1,2,-1",
        "10,5,1",
    })
    void solution1WorksAsExpected(int N, int K, int expected) {
        assertEquals(expected, Codility.solution1(N, K));
    }

    @ParameterizedTest
    @CsvSource( value = {
        "4,4:2:4:6",
    })
    void solution2WorksAsExpected(int N, String expectedList) {
        int[] expected = Arrays.stream(expectedList.split(":")).mapToInt(Integer::parseInt).toArray();
        assertEquals(expected.length, Codility.solution2(N).length);
    }

    @ParameterizedTest
    @CsvSource( value = {
        "4:2:4:6,0",
    })
    void findMinWorksAsExpected(String list, int expected) {
        int[] args = Arrays.stream(list.split(":")).mapToInt(Integer::parseInt).toArray();
        assertEquals(expected, Codility.find_min(args));
    }
}
