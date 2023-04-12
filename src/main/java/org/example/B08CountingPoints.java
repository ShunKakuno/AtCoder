package org.example;

import java.util.Scanner;

public class B08CountingPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        // 1<=X, Y<=1500のため1501で設定しておく
        int[][] XY = new int[1501][1501];
        int[][] total = new int[1501][1501];
        // 0の横列に0を入れていく
        for (int i = 0;i < 1501;i++) {
                XY[0][i] = 0;
        }
        // 0の縦列に0を入れていく
        for (int i = 0;i < 1501;i++) {
            XY[i][0] = 0;
        }
        // 入力された座標のところに1を入れていく(X=2, Y=1なら[2,1]に1をマーク)
        for (int i = 0;i < point;i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            // XY[X][Y] = 1ってしてたけどこれだと上書きされちゃうからダメ
            XY[X][Y]++;
        }
        // 横の累積和を求める
        for (int i = 1;i < 1501;i++) {
            for (int j = 1;j < 1501;j++) {
                XY[i][j] += XY[i][j - 1];
            }
        }
        // 縦の累積和を求める
        for (int i = 1;i < 1501;i++) {
            for (int j = 1;j < 1501;j++) {
                XY[i][j] += XY[i - 1][j];
            }
        }
        int question = sc.nextInt();
        for (int i = 0;i < question;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            // マスの中は左上+右下-左下-右上
            int result = XY[c][d] + XY[a - 1][b - 1] - XY[a - 1][d] - XY[c][b - 1];
            System.out.println(result);
        }
    }
}
