package src.task2_5;

public class Task2_5 {
    public void getMeAnswer2_5(){
        int n = 0;
        int answer = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(answer + ",\t");
            answer -= 5;
        }
    }
}
