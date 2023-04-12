package org.example;

import java.util.Scanner;

public class B04BinaryRepresentation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        int length = new String(N.toString()).length();
        int result = 0;
        for (int i = 0;i < length;i++) {
            int targetKeta = (N % 10);
            int nishin = 1 << i;
            result += targetKeta * nishin;
            N /= 10;
        }
        System.out.print(result);
    }
}
