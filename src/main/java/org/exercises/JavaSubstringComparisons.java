package org.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparisons {
    public static String[] main(String[] args) {
        String s = args[0];
        int k = Integer.parseInt(args[1]);
        List<String> subs = new ArrayList<>();
        for (int i = k; i <= s.length(); i++) {
            subs.add(s.substring(i-k, i));
        }
        subs.sort(String::compareTo);

        List<String> output = new ArrayList<>();
        output.add(subs.get(0));
        output.add(subs.get(subs.size()-1));

        return output.toArray(new String[0]);
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();

        in.close();

        List<String> subs = new ArrayList<>();
        for (int i = k; i <= s.length(); i++) {
            subs.add(s.substring(i-k, i));
        }
        subs.sort(String::compareTo);

        System.out.println(subs.get(0));
        System.out.println(subs.get(subs.size()-1));
    }
}
