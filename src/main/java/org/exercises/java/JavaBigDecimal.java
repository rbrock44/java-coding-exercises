package org.exercises.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class JavaBigDecimal {
    public static String[] main(String[] args) {
        int n = Integer.parseInt(args[0]);

        String[] s = new String[n];
        System.arraycopy(args, 1, s, 0, n);

        Arrays.sort(s, (s1, s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1)));

        Arrays.stream(s).forEach(System.out::println);
        return s;
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.next();
        }
        in.close();

        Arrays.sort(s, (s1, s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1)));

        Arrays.stream(s).forEach(System.out::println);
    }
}
