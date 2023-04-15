package org.example;

import java.util.Scanner;

public class A09WinterinALGOKingdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();
        int date = sc.nextInt();
        // 例えばheight=5でsnow[C + 1][D + 1]++;の場合[6][6]になる。この時要素数は0~6の7個になるため+2しないといけない
        int[][] snow = new int[height + 2][weight + 2];
        for (int i = 1;i <= date;i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            snow[A][B]++;
            snow[A][D + 1]--;
            snow[C + 1][D + 1]++;
            snow[C + 1][B]--;
        }
        // 横の累積和を計算
        for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= weight; j++) {
                    snow[i][j] += snow[i][j - 1];
                }
        }
        // 縦の累積和を計算 (縦の計算は横の累積和が完了した後にやらないとバグるよ)
        for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= weight; j++) {
                    snow[i][j] += snow[i - 1][j];
                }
            }
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= weight; j++) {
                if (j >= 2) {
                    System.out.print("\n");
                }
                // 最終的な結果を出力
                System.out.print(snow[i][j] + "\t");
            }
        }
    }
}
