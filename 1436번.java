import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int count = 0;
        int title = 666;

        while(true) {
            String test = Integer.toString(title);
            if(test.contains("666")) count += 1;
            if (count == number) {
                System.out.println(test);
                break;
            }
            title +=1;
        }
    }
}
