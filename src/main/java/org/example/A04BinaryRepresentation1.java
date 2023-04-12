package org.example;

import java.util.Scanner;

public class A04BinaryRepresentation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 後ろから入れていきたいからi=9
        for (int i = 9; i >= 0; i--) {
            // 数値 << シフトさせたい数;->1のi乗
            int wari = (1 << i);
            System.out.print((N / wari) % 2);
        }
    }
}
