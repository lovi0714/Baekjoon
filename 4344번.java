
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getHighScoreStudents();
    }
    static void getHighScoreStudents(){
        Scanner sc = new Scanner(System.in);

        int testCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < testCount; i++) {

            String[] score = sc.nextLine().split(" ");
            float total = 0;
            float avgHighCount = 0;

            for (int s = 1; s < score.length; s++) {
                total += Integer.parseInt(score[s]);
            }

            float studentNumber = Integer.parseInt(score[0]);
            float avg = total / studentNumber;

            for (int s = 1; s < score.length; s++) {
                if(Integer.parseInt(score[s]) > avg) avgHighCount += 1;
            }

            float result = avgHighCount / studentNumber * 100;

            System.out.println(String.format("%.3f",result) + "%");
        }

    }
}
