package org.exercises;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class JavaMD5 {
    public static String main(String[] args)  {
        String a = args[0];

        return toMd5(a);
    }

    // HackerRank web portal solution
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        in.close();

        System.out.println(toMd5(a));
    }

    public static String toMd5(String a) {
        try {
            byte[] bytesOfMessage = a.getBytes("UTF-8");

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] theMD5digest = md.digest(bytesOfMessage);

            return String.format("%032x", new BigInteger(1, theMD5digest));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
