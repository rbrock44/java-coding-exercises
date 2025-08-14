package org.exercises;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static String[] main(double payment) {
        List<String> output = new ArrayList<String>();
        output.add("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        output.add("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment));
        output.add("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        output.add("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));

        return output.toArray(new String[0]);
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double payment = Double.parseDouble(scanner.next());
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));

        scanner.close();
    }
}
