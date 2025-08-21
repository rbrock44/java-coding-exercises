package org.exercises.java;

import java.util.Scanner;

class MyRegex {
    public String pattern = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])"+"."+
        "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])"+"."+
        "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])"+"."+
        "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";;
}

public class JavaRegex {
    public static Boolean main(String[] args) {
        String ip = args[0].toUpperCase();

        return ip.matches(new MyRegex().pattern);
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        String ip = in.next().toUpperCase();

        in.close();

        System.out.println(ip.matches(new MyRegex().pattern));
    }
}
