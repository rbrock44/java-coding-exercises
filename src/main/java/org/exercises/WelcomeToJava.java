package org.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WelcomeToJava {
    public static String[] main(String[] args) {
        List<String> output = new ArrayList<String>();

        output.add("Hello, World.");
        output.add("Hello, Java.");

        return output.toArray(new String[0]);
    }

    // HackerRank web portal solution
    public void main2(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}
