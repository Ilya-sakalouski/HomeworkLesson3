package src.task2_6;

public class Task2_6 {
    public void getMeAnswer2_6() {

        int a = 10;
        double answer = 0;

        for (int i = 0; i < 11; i++) {
            answer = Math.pow(a, 2);
            a++;
            System.out.print((int) answer + "\t");
        }
    }
}
