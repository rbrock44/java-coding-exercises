package org.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {
    public static String main(String[] args) {
        String a = args[0].toUpperCase();
        String b = args[1].toUpperCase();

        Map<Character, Integer> mapA = countCharacterOccurrences(a);
        Map<Character, Integer> mapB = countCharacterOccurrences(b);

        boolean areEqual = mapA.entrySet().stream().allMatch(entry -> entry.getValue().equals(mapB.get(entry.getKey())));

        boolean areEqualOtherWay = mapB.entrySet().stream().allMatch(entry -> entry.getValue().equals(mapA.get(entry.getKey())));

        return areEqual && areEqualOtherWay ? "Anagrams" : "Not Anagrams";
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next().toUpperCase();
        String b = in.next().toUpperCase();

        Map<Character, Integer> mapA = countCharacterOccurrences(a);
        Map<Character, Integer> mapB = countCharacterOccurrences(b);

        boolean areEqual = mapA.entrySet().stream().allMatch(entry -> entry.getValue().equals(mapB.get(entry.getKey())));
        boolean areEqualOtherWay = mapB.entrySet().stream().allMatch(entry -> entry.getValue().equals(mapA.get(entry.getKey())));

        System.out.println(areEqual && areEqualOtherWay ? "Anagrams" : "Not Anagrams");
    }

    public static Map<Character, Integer> countCharacterOccurrences(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }

        return charCounts;
    }
}
