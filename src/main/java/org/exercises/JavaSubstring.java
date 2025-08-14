package org.exercises;

import java.util.Scanner;

public class JavaSubstring {
    public static String main(String[] args) {
        String s = args[0];
        int start = Integer.parseInt(args[1]);
        int end = Integer.parseInt(args[2]);

        return s.substring(start, end);
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        in.close();

        System.out.println(S.substring(start, end));
    }
}
