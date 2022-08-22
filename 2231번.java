import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        if(N == 1) System.out.println(0);
        
        for (int i = 1; i < N; i++) {
            if(getAnswer(i) == N) {
                System.out.println(i);
                break;
            }
            if(i == N - 1 && getAnswer(i) != N) System.out.print(0);
        }


    }

    static int getAnswer(int number) {
        int sum = number;

        while(number > 0) {

            sum += number % 10;

            number /= 10;
        }

        return sum;
    }

}
