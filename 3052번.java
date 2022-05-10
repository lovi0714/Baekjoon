import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> result = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            int remainNumber = getResult(number);
            result.add(remainNumber);
        }
        System.out.println(result.size());
    }
     static int getResult(int number) {
         return number % 42;
    }
}
