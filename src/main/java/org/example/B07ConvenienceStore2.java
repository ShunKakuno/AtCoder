package org.example;

import java.util.Scanner;

public class B07ConvenienceStore2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int openTime = 0;
            int closeTime = sc.nextInt();
            int person = sc.nextInt();
            // 0~10のため11要素必要になる
            int[] workTime = new int[closeTime + 1];
            for (int i = 1;i <= person;i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                workTime[a] += 1;
                workTime[b] -= 1;
            }
            int[] ans = new int[closeTime + 1];
            ans[0] = 0;
            int result = 0;
            for (int i = 0;i <= closeTime;i++) {
                // workTime[0]にも値が入っているから代入する
                if (i == 0) {
                    ans[i] = workTime[i];
                    continue;
                }
                // 該当時刻と該当時刻の前の累積和を求める
                ans[i] = ans[i - 1] + workTime[i];
            }
            for (int i = 0; i < closeTime; i++) {
                System.out.println(ans[i]);
            }
        }
    }