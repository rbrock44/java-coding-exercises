package org.exercises;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static Boolean main(String[] args) {
        String a = args[0];
        return isBalancedParentheses(a);
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String input = in.next();

            System.out.println(isBalancedParentheses(input));
        }

        in.close();
    }

    private static Boolean isBalancedParentheses(String a) {
        Stack<String> stack = new  Stack<>();
        for (char ch : a.toCharArray()) {
            String leftSides = "{[(";
            if (leftSides.indexOf(ch) >= 0) {
                stack.push(ch + "");
            } else {
                if (stack.empty()) {
                    return false;
                }

                String compare = stack.pop();
                String rightSide = "";
                if (ch == ']') {
                    rightSide = "[";
                } else if (ch == '}') {
                    rightSide = "{";
                } else if (ch == ')') {
                    rightSide = "(";
                }

                if (compare.compareTo(rightSide) != 0) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
