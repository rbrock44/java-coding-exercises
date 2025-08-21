package org.exercises.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaStringsIntroduction {
    public static String[] main(String[] args) {
        String a = args[0];
        String b = args[1];
        List<String> output = new ArrayList<String>();

        String upperA = a.substring(0, 1).toUpperCase() + a.substring(1);
        String upperB = b.substring(0, 1).toUpperCase() + b.substring(1);

        output.add((a.length() + b.length()) + "");
        output.add(a.compareTo(b) > 0 ? "Yes" : "No");
        output.add(upperA + " " + upperB);

        return output.toArray(new String[0]);
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        scanner.close();

        String upperA = a.substring(0, 1).toUpperCase() + a.substring(1);
        String upperB = b.substring(0, 1).toUpperCase() + b.substring(1);

        System.out.println((a.length() + b.length()) + "");
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.println(upperA + " " + upperB);
    }
}
