import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean[] primeList;
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        do {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0) break;

            int doubleN = n * 2;
            int answer = 0;

            primeList = new boolean[doubleN + 1];
            getPrime(doubleN);

            for (int i = n + 1; i <= doubleN; i++) {
                if (!primeList[i]) answer += 1;
            }

            System.out.println(answer);

        }while(true);
    }

    static void getPrime(int doubleN) {

        // false = 소수, 1은 소수가 아님
        primeList[0] = true;
        primeList[1] = true;

        for(int i = 2; i * i <= doubleN; i++) {
            // primeList[i]가 소수라면
            if(!primeList[i]) {
                // primeList[j]는 소수가 아닌 표시
                for(int j = i * i; j <= doubleN; j += i) primeList[j] = true;
            }
        }
    }
}
