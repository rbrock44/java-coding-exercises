package org.exercises;

import java.io.*;
import java.util.*;

public class JavaLoopsII {
    public static String[] main(String[] args) {
        int q = Integer.parseInt(args[0]);

        String[] queries = new String[q];
        int argsIndex = 1;
        for (int i = 0; i < q; i++) {
            String[] queryArgs = args[argsIndex].split(" ");
            int a = Integer.parseInt(queryArgs[0]);
            int b = Integer.parseInt(queryArgs[1]);
            int n = Integer.parseInt(queryArgs[2]);

            StringBuilder query = new StringBuilder();

            int sum = a;
            for (int j = 0; j < n; j++) {
                double calc = Math.pow(2, j) * b;
                sum += (int) calc;
                query.append(" ").append(sum);
            }

            queries[i] = query.toString().trim();
            argsIndex++;
        }
        return queries;
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            String n = scanner.next();

            List<String> fittedTypes = new ArrayList<String>();

            try {
                Byte.parseByte(n);
                fittedTypes.add("* byte");
            } catch (Exception ignored) {
            }

            try {
                Short.parseShort(n);
                fittedTypes.add("* short");
            } catch (Exception ignored) {
            }

            try {
                Integer.parseInt(n);
                fittedTypes.add("* int");
            } catch (Exception ignored) {
            }

            try {
                Long.parseLong(n);
                fittedTypes.add("* long");
            } catch (Exception ignored) {
            }

            if (!fittedTypes.isEmpty()) {
                System.out.println(n + " can be fitted in:");
                for (String item : fittedTypes) {
                    System.out.println(item);
                }
            } else {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
