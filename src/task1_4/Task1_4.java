package src.task1_4;

import java.util.Scanner;

public class Task1_4 {
    public void getMeAnswer1_4() {
        System.out.println("Enter your temperature");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp > -5) System.out.println("Warm");
        else if (temp > -20) System.out.println("Normal");
        else System.out.println("Cold");
    }
}
