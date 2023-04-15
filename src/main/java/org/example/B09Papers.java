package org.example;

import java.util.Scanner;

public class B09Papers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int papers = sc.nextInt();
        // 座標を入れる箱を作っておく(0 <= 座標 <= 1500のため要素数は1501)
        int[][] square = new int[1501][1501];
        for (int i = 0;i < papers;i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            // 右上、右下、左上、左下に値を入れる
            square[A][B]++;
            square[A][D]--;
            square[C][B]--;
            square[C][D]++;
        }
        // 横の列を埋める
        for (int i = 0;i < 1501;i++) {
            for (int j = 1;j < 1501;j++) {
                square[i][j] += square[i][j - 1];
            }
        }
        // 縦の列を埋める
        for (int i = 1;i < 1501;i++) {
            for (int j = 0;j < 1501; j++) {
                square[i][j] += square[i - 1][j];
            }
        }
        int result = 0;
        //
        for(int i = 0; i < 1501; i++){
            for(int j = 0; j < 1501; j++){
                // [i][j]が1以上であればその範囲には紙があるということ
                if(square[i][j] != 0){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
