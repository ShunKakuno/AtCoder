package org.example;

import java.util.Scanner;

public class A12Printer {
    static int printer;
    static int paper;
    static int[] minutes;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printer = sc.nextInt();
        paper = sc.nextInt();
        minutes = new int[printer + 1];
        for (int i = 1; i <= printer; i++) minutes[i] = sc.nextInt();
        // 2分探索
        // Lは探索範囲の左端、Rは探索範囲の右端
        long L = 1, R = 1000000000;
        while (L < R) {
            long M = (L + R) / 2;
            boolean answer = check(M);
            // 答えが Mid+1 以上であることが分かる
            if (answer == false) L = M + 1;
            // 答えが Mid 以下であることが分かる
            if (answer == true) R = M;
        }
        // 出力（このとき Left=Right になっている）
        System.out.println(L);
    }

    // 答えがM以下かを判定し、Yesであればtrue、Noであればfalse を返す
    public static boolean check(long M) {
        long sum = 0;
        // プリンタの台数分回して渡された半分の値÷分数をsumに格納する
        for (int i = 1; i <= printer; i++) sum += M / (long)minutes[i]; //「x ÷ A[i]」の小数点以下切り捨て
        // sumが紙の枚数を上回ったらtueを返す
        if (sum >= (long)paper) return true;
        // sumが紙の枚数より下だったらfalseを返す
        return false;
    }

}
