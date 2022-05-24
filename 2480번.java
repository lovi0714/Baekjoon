import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result = getGameResult(num1, num2, num3);

        System.out.println(result);

    }
    static int getGameResult(int num1, int num2, int num3){
        int result = 0;
        
        if(num1==num2 && num2 == num3) result = 10000 + num1 * 1000;
        if(num1!=num2 && num2 != num3 && num1 != num3) result = Math.max(Math.max(num1, num2),num3) * 100 ;
        if(num1==num2 && num2 != num3) result = 1000 + num1 * 100;
        if(num2==num3 && num3 != num1) result = 1000 + num2 * 100;
        if(num1==num3 && num2 != num1) result = 1000 + num3 * 100;

        return result;
    }
}
