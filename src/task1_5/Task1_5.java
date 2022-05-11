package src.task1_5;

import java.util.Scanner;

public class Task1_5 {
    public void getMeAnswer1_5() {
        System.out.println("Enter your number of rainbow color");
        Scanner sc = new Scanner(System.in);
        int color = sc.nextInt();

        switch (color) {
            case 1 -> System.out.println("Red");
            case 2 -> System.out.println("Orange");
            case 3 -> System.out.println("Yellow");
            case 4 -> System.out.println("Green");
            case 5 -> System.out.println("light-blue");
            case 6 -> System.out.println("Blue");
            case 7 -> System.out.println("Violet");
            default -> System.out.println("Wrong number");
        }
    }
}
