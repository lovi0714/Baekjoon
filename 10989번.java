import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberCount = Integer.parseInt(bf.readLine());
        int[] numbers = new int[numberCount];

        for (int i = 0; i < numberCount; i++) {
            numbers[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            bw.write(String.valueOf(number)+"\n");
        }
        bw.flush();
        bw.close();
    }
}


