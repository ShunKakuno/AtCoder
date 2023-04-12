package org.example;

import java.util.Scanner;

public class A07EventAttendance {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int date = sc.nextInt();
            int person = sc.nextInt();
            // date+2にしないとdateの最大値+1したときにエラーが出る
            int[] compare = new int[date + 2];
            compare[0] = 0;
            for (int i = 1;i <= person;i++) {
                int firstDay = sc.nextInt();
                int lastDay = sc.nextInt();
                    compare[firstDay] += 1;
                    compare[lastDay + 1] -= 1;
            }
            int result = 0;
            // resultに前日比の結果を格納していく(2,3だったら2日目を3日目の比を格納)
            for (int i = 1;i <= date;i++) {
                result += compare[i];
                System.out.println(result);
            }
    }
}
