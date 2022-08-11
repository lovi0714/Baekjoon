import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        String tmp = bf.readLine();
        String[] numbers = tmp.split(" ");
        int total = 0;

        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(numbers[i]);
            if(number == 1) {
                total += 1;
                continue;
            }
            if(number == 2) {
                continue;
            }
            for (int index = 2; index < number; index++) {
                if(number % index == 0) {
                    total += 1;
                    break;
                }
            }

        }
        System.out.println(count - total);
    }
}



