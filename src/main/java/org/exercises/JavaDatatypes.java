package org.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaDatatypes {
    public static String[] main(String[] args) {
        int q = Integer.parseInt(args[0]);

        List<String> output = new ArrayList<String>();
        int argsIndex = 1;
        for (int i = 0; i < q; i++) {
            String n = args[argsIndex];

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
                output.add(n + " can be fitted in:");
                output.addAll(fittedTypes);
            } else {
                output.add(n + " can't be fitted anywhere.");
            }

            argsIndex++;
        }
        return output.toArray(new String[0]);
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        int argsIndex = 1;
        for (int i = 0; i < q; i++) {
            String n = args[argsIndex];

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

            argsIndex++;
        }

        scanner.close();
    }
}
