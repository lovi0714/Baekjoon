import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String numbers = br.readLine();
            StringTokenizer st = new StringTokenizer(numbers);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = getGreatestCommonDivisor(a, b);

            int leastCommonMultiple = a * b / c;

            System.out.println(leastCommonMultiple);
        }

    }

    static int getGreatestCommonDivisor(int a, int b) {
        int tmp = 0;

        while(b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
