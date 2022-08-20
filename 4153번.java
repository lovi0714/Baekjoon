import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void  main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            String tmp = bf.readLine();
            String numbers[] = tmp.split(" ");

            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            int c = Integer.parseInt(numbers[2]);

            int[] abc = {a,b,c};

            Arrays.sort(abc);

            a = abc[0];
            b = abc[1];
            c = abc[2];

            if(a == 0 && b == 0 && c == 0) break;

            if ((a * a + b * b) == c * c) {
                System.out.println("right");
                continue;
            }

            System.out.println("wrong");
        }

    }
}
