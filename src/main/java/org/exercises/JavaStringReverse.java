package org.exercises;

import java.util.Scanner;

public class JavaStringReverse {
    public static String main(String[] args) {
        String s = args[0];
        if (s.equals(new StringBuilder(s).reverse().toString())) {
            return "Yes";
        } else {
            return "No";
        }
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        in.close();

        if (s.equals(new StringBuilder(s).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
