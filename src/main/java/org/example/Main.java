package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A >= 1 && A <= 100 && B >= 1 && B <= 100) {
            System.out.println(A + B);
        }
    }
}