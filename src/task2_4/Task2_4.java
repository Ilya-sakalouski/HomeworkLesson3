package src.task2_4;

public class Task2_4 {
    public void getMeAnswer2_4() {
        int a = 7;
        int b = 1;
        int answer = 0;

        while (answer < 98) {
            answer = a * b;
            b++;
            System.out.print(answer + "\t");
        }
    }
}
