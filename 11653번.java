import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bf.readLine());
        doFactorization(number);

    }

    static void doFactorization(int number){
        for (int i = 2; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
                number /= i;
                i = 1;
            }
        }
    }
}
