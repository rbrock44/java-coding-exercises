package org.exercises.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaOutputFormatting {
    static String banner = "================================";

    public static String[] main(String[] args) {
        List<String> output = new ArrayList<String>();

        output.add(banner);
        for (String arg : args) {
            String[] splitArg = arg.split(" ");
            String name = splitArg[0];
            String num = splitArg[1];
            String formattedNum = String.format("%3s", num).replace(" ", "0");
            String formattedName = String.format("%-15s", name);
            output.add(formattedName + formattedNum);
        }
        output.add(banner);

        return output.toArray(new String[0]);
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(banner);
        while (scanner.hasNextLine()) {
            String name = scanner.next();
            String num = scanner.next();
            String formattedNum = String.format("%3s", num).replace(" ", "0");
            String formattedName = String.format("%-15s", name);
            System.out.println(formattedName + formattedNum);
        }
        System.out.println(banner);

        scanner.close();
    }
}
