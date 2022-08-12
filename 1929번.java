import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean[] primeList;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String tmp = bf.readLine();
        String[] numbers = tmp.split(" ");
        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[1]);

        primeList = new boolean[max + 1];
        getPrime(max);
        
        for(int i = min; i <= max; i++) {
            if(!primeList[i]) System.out.println(i);
        }
    }

    static void getPrime(int max) {

        // false = 소수, 1은 소수가 아님
        primeList[0] = true;
        primeList[1] = true;

        for(int i = 2; i * i <= max; i++) {
            // primeList[i]가 소수라면
            if(!primeList[i]) {
                // primeList[j]는 소수가 아닌 표시
                for(int j = i * i; j <= max; j += i) primeList[j] = true;
            }
        }
    }
}
