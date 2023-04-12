package org.example;

import java.util.Scanner;

public class B06Lottery {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] win = new int[N + 1];
            int[] lose = new int[N + 1];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                // 1だったらあたりに1、0なら外れに1を入れてマークしてあげる
                if (A[i] == 1) {
                    win[i + 1] = win[i] + 1;
                    lose[i + 1] = lose[i];
                } else {
                    win[i + 1] = win[i];
                    lose[i + 1] = lose[i] + 1;
                }
            }

            int Q = sc.nextInt();
            for (int i = 0; i < Q; i++) {
                int L = sc.nextInt();
                int R = sc.nextInt();
                int winNum = win[R] - win[L - 1];
                int loseNum = lose[R] - lose[L - 1];
                if (winNum > loseNum) {
                    System.out.println("win");
                } else if (winNum < loseNum) {
                    System.out.println("lose");
                } else {
                    System.out.println("draw");
                }
            }
        }
    }
