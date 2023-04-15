package org.example;

import java.util.Scanner;

public class A11BinarySearch1 {
    static int terms, termX;
    static int[] hairetu;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        terms = sc.nextInt();
        termX = sc.nextInt();
        hairetu = new int[terms + 1];;
        for (int i = 1; i <= terms; i++) hairetu[i] = sc.nextInt();
        int result = check(termX);
        System.out.println(result);
    }

    public static int check(int termX) {
        // 2分探索でXの位置を明らかにする
        int L = 1, R = terms;
        // 探索範囲がなくなるまで比較を繰り返す
        while (L <= R) {
            // 1番目~最後の要素を2で割って半分にする
            int M = (L + R) / 2;
            // 中央値と比較してそれよりも大きいか小さいかチェック(右半分をチェックしていく)
            if (termX < hairetu[M]) R = M - 1;
            // Xと中央値が同じならreturnして終わる
            if (termX == hairetu[M]) return M;
            // 中央値と比較してそれよりも大きいか小さいかチェック(左半分をチェックしていく)
            if (termX > hairetu[M]) L = M + 1;
        }
        // 整数Xが存在しない場合(ここは今回Xに値が入らないことはないからreturnされることはない)
        return -1;
    }
}
