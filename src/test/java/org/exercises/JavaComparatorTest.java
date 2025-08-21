package org.exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JavaComparatorTest {
    @ParameterizedTest
    @CsvSource(value = {
        "5,amy:100:david:100:heraldo:50:aakansha:75:aleksa:150,aleksa;150:amy;100:david;100:aakansha;75:heraldo;50"
    })
    void worksAsExpected(int n, String players, String expected) {
        String[] args = Stream.concat(
            Stream.of(n + ""),
            Stream.of(players.split(":"))
        ).toArray(String[]::new);

        String[] exp = expected.split(":");
        Player[] expectedPlayers = new Player[n];
        for (int i = 0; i < exp.length; i++) {
            String[] things = exp[i].split(";");
            expectedPlayers[i] = new Player(things[0], Integer.parseInt(things[1]));
        }

        Player[] result = JavaComparator.main(args);

        for (int i = 0; i < expectedPlayers.length; i++) {
            assertEquals(result[i].toString(), expectedPlayers[i].toString());
        }
    }
}
