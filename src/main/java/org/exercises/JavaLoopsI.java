package org.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JavaLoopsI {
    public static String[] main(String[] args) {
        int n = Integer.parseInt(args[0]);

        List<String> output = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            output.add(n + " x " + i + " = " + (n * i));
        }
        return output.toArray(new String[0]);
    }

    // HackerRank web portal solution
    public static void main2(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}
