import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String firstInput = bf.readLine();
        int count = Integer.parseInt(firstInput);

        String secondInput = bf.readLine();
        String[] tmpNumbers = secondInput.split(" ");
        int numbers[] = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(tmpNumbers[i]);
        }

        Arrays.sort(numbers);

        int min = numbers[0];
        int max = numbers[numbers.length - 1];

        System.out.println(min * max);

    }
}
