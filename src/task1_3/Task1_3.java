package src.task1_3;

import java.util.Scanner;

public class Task1_3 {
    public void getMeAnswer1_3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even number");
        } else System.out.println("Odd number");
    }
}
