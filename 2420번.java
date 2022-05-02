import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        System.out.print(getDegreeOfFamous(num1,num2));
    }
     static long getDegreeOfFamous(long num1, long num2) {
        long result = 0;
        result = Math.abs(num1 - num2);
        return result;
    }
}
