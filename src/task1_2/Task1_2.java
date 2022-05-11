package src.task1_2;

import java.util.Scanner;

public class Task1_2 {
    public void getMeAnswer1_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month");
        int num = scanner.nextInt();

        if (num == 1 || num == 2 || num == 12) System.out.println("Winter");
        else if (num == 3|| num == 4 || num == 5) System.out.println("Spring");
        else if (num == 6 || num == 7 || num == 8) System.out.println("Summer");
        else if (num == 9 || num == 10 || num == 11) System.out.println("Autumn");
        else System.out.println("wrong value");
    }
}

