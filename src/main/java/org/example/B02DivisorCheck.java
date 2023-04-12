package org.example;

import java.util.Scanner;

public class B02DivisorCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        for (int i = A; i <= B; i++) {
            if (100 % i == 0) {
                System.out.print("Yes");
                // returnはこのメソッド全体の処理をここで終わらせる
                return;
            }
        }
        System.out.print("No");
    }
}

