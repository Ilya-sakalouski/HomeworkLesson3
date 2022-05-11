package src.task3_1;

public class Task3_1 {
    public void getMeAnswer3_1() {
        int val1 = 1;
        int val2 = 1;
        int val3;
        System.out.print(val1 + "\t" + val2 + "\t");

        for (int i = 3; i <= 11; i++) {
            val3 = val1 + val2;
            System.out.print(val3 + "\t");
            val1 = val2;
            val2 = val3;
        }
    }
}
