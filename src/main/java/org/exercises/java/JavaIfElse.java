package org.exercises.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIfElse {
    public static String main(String[] args) {
        int n = Integer.parseInt(args[0]);

        return getWeird(n);
    }

    // HackerRank web portal solution
    public static void main2(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        System.out.println(getWeird(N));
    }

    private static String getWeird(int n) {
        String weird = "Weird";
        String notWeird = "Not Weird";

        if (n % 2 == 1) {
            return weird;
        } else if (n % 2 == 0 && n >= 2 && n <= 5) {
            return notWeird;
        } else if (n % 2 == 0 && n >= 6 && n <= 20) {
            return weird;
//        } else if (n % 2 == 0 && n > 20) {
        } else {
            return notWeird;
        }
    }
}
