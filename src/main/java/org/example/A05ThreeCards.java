package org.example;

import java.util.Scanner;

public class A05ThreeCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= N;i++) {
            for (int j = 1;j <= N;j++) {
                int z = K - i - j;
                if (z >= 1 && z <= N) {
                    result += 1;
                }
            }
        }
        System.out.print(result);
    }
}
