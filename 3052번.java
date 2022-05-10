import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(getResult());
    }
     static <E> int getResult() {
        HashSet<Integer> result = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            int number = sc.nextInt();
            int remainNumber = number%42;
            result.add(remainNumber);
        }
        return result.size();
    }
}
