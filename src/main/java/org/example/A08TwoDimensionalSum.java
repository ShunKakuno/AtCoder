package org.example;

import java.util.Scanner;

public class A08TwoDimensionalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();
        int[][] X = new int[height + 1][weight + 1];
        // 0番目の横の列に0を入れていく
        for (int i = 0; i <= weight; i++) {
            X[0][i] = 0;
        }
        // 0番目の縦の列に0を入れていく
        for (int i = 0; i <= height; i++) {
            X[i][0] = 0;
        }
        // マス目に数字を入れていく
        for (int i = 1; i <= height; i++) {
            // 0番目には何も入れないから0を入れておく
            for (int j = 1; j <= weight; j++) {
                X[i][j] = sc.nextInt();
                // 横の累積和を計算
                X[i][j] = X[i][j] + X[i][j - 1];
            }
        }
        // 縦の累積和を計算
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= weight; j++) {
                X[i][j] = X[i][j] + X[i - 1][j];
            }
        }
        int leftUp = 0;
        int leftDown = 0;
        int rightUp = 0;
        int rightDown = 0;
        int question = sc.nextInt();
        for (int i = 0; i < question; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            leftUp = X[A - 1][B - 1];
            // 左下は確実に右下と同じ列になる
            leftDown = X[C][B - 1];
            // 右上は確実に左上と同じ列になる
            rightUp = X[A - 1][D];
            rightDown = X[C][D];
            System.out.println(leftUp + rightDown - leftDown - rightUp);
        }
    }
}
