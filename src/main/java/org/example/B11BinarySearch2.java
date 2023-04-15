package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class B11BinarySearch2 {
    static int terms;
    static int[] hairetu;
    static int question;
    static int[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        terms = sc.nextInt();
        hairetu = new int[terms];;
        for (int i = 0;i < terms;i++) {
            hairetu[i] = sc.nextInt();
        }
        // 昇順に並び替える
        Arrays.sort(hairetu);
        question = sc.nextInt();
        check = new int[question + 1];
        for (int i = 0;i < question;i++) {
            check[i] =sc.nextInt();
        }
        for (int i = 0;i < question;i++) {
            // Arrays.binarySearch(対象の配列, 対象の数字)で簡単に2分探索してくれる
            // 対象の数字が配列にない場合は負の整数を返す
            int result = Arrays.binarySearch(hairetu, check[i]);
            // 対象の数字が配列になくて負の整数の場合
            // [1,3,3,3,1]の場合に2を入力すると2はないから-で出力され、2以下の整数+1分出力される。今夏にの場合は1が2こあるから-3で出力
            if (result < 0) {
                result = -(result +1);
            }
            System.out.println(result);
        }
        sc.close();
    }
}
