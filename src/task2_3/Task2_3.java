package src.task2_3;

import java.util.Scanner;

public class Task2_3 {
    public void getMeAnswer2_3() {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int answer = 0;
        for (int i = 1; i <= num; i++) {
            answer += i;

        }
        System.out.println(answer);
    }
}
