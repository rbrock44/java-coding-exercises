package org.exercises;

import java.io.*;
import java.util.*;

public class JavaLoopsII {

    // commented out lines are for the HackerRank web portal
    // lines with comments at the end are specific to my project
    public String[] main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int q = scanner.nextInt();
        int q = Integer.parseInt(args[0]); //

        String[] queries = new String[q]; //
        int argsIndex = 1;
        for (int i = 0; i < q; i++) {
            String[] queryArgs = args[argsIndex].split(" ");
            int a = Integer.parseInt(queryArgs[0]); //
            int b = Integer.parseInt(queryArgs[1]); //
            int n = Integer.parseInt(queryArgs[2]); //
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int n = scanner.nextInt();

            StringBuilder query = new StringBuilder();

            int sum = a;
            for (int j = 0; j < n; j++) {
                double calc = Math.pow(2, j) * b;
                sum += (int) calc;
                query.append(" ").append(sum);
            }

            queries[i] = query.toString().trim(); //
//            System.out.println(query.toString().trim());
            argsIndex++;
        }
//        scanner.close();
        return queries; //
    }
}
