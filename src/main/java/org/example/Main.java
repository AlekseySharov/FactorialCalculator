package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        System.out.println(value + " != " + factorialString(value) + " = " + factorial(value));
    }

    public static String factorialString(int value) {
        StringBuilder format = new StringBuilder();
        for (int i = 1; i <= value; i++) {
            format.append(i).append(" x ");
        }
        format.setLength(format.length() - 3);
        return format.toString();
    }

    public static int factorial(int value) {
        int count = 1;
        for (int i = 1; i <= value; i++) {
            count *= i;
        }
        return count;
    }
}