package org.example;

import java.util.Scanner;

public class A02LinerSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0;i < N;i++) {
            A[i] = scanner.nextInt();
        }
        boolean check = false;
        for (int loop = 0;loop < N;loop++) {
            if (A[loop] == X) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
