package org.exercises;

import java.time.LocalDate;

public class JavaDateAndTime {
    // HackerRank web portal solution
    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }
}
