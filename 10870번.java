import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        System.out.println(getFibonacciNumber(n));

    }

    static int getFibonacciNumber(int n) {

        if(n == 0) return 0;
        if(n == 1) return 1;

        return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
    }
}
