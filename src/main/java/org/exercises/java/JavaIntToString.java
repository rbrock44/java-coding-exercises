package org.exercises.java;

import java.util.Scanner;

public class JavaIntToString {
    public static String main(String[] args) {
        String s = String.valueOf(args[0]);
        try {
            Integer.parseInt(s);
            return "Good Job";
        } catch (Exception ignored){
            return "Wrong Answer";
        }
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String wrong = "Wrong answer";
        try {
            if (Integer.parseInt(Integer.toString(n)) == n) {
                System.out.println("Good job");
            } else {
                System.out.println(wrong);
            }
        } catch (Exception ignored){
            System.out.println(wrong);
        }
    }
}
