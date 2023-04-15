package org.example;

import java.util.Scanner;
class A10ResortHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int room = sc.nextInt();
        int[] person = new int[room + 1];
        // 各部屋の人数
        for (int i = 1;i <= room;i++) person[i] = sc.nextInt();
        int day = sc.nextInt();
        // どこからどこが休館室かの入力
        int[] L = new int[day + 1];
        int[] R = new int[day + 1];
        for (int i = 1;i <= day;i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        int[] frontResult = new int[room + 1];
        // 最初の部屋は比較する必要ないからあらかじめ入れておく
        frontResult[1] = person[1];
        // Math.maxメソッドを使用して1~の休館室を除いた大きいほうを取得する(j=2にしているのはあらかじめ最初の部屋の人数は入れているから(1,0を比べる必要ないしね))
        // 格納済みのfrontResult[j - 1]とperson[j]を比較する
        for (int j = 2;j <= room;j++) frontResult[j] = Math.max(frontResult[j - 1], person[j]);
        int[] backResult = new int[room + 1];
        // 最後の部屋はk比較する必要ないから先に入れておく
        backResult[room] = person[room];
        // roomの一番後ろ(roomの最大値)からRまでmaxメソッドを使用して最大値を取得する(j=room-1にしているのはあらかじめ最後の部屋の人数は入れているから(7,8は比べられないしね))
        // 格納済みのbackResult[j + 1]とperson[j]を比較する
        for (int j = room - 1;1 <= j;j--) backResult[j] = Math.max(backResult[j + 1], person[j]);
        // 出力
        for (int i = 1;i <= day;i++) System.out.println(Math.max(frontResult[L[i] - 1], backResult[R[i] + 1]));
    }
}
