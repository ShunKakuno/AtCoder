package org.example;

import java.util.Scanner;

public class A03TwoCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] P = new int[N];
        int[] Q = new int[N];
        for (int i = 0; i < N;i++) {
            P[i] = sc.nextInt();
        }
        for (int i = 0; i < N;i++) {
            Q[i] = sc.nextInt();
        }
        for (int i = 0;i < N;i++) {
            for (int j = 0;j < N;j++) {
                if (K == P[i] + Q[j]) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.print("No");
    }
}
