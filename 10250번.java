import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(bf.readLine());

        for (int i = 0; i < testCaseCount; i++) {
            String tmp = bf.readLine();
            String[] testCase = tmp.split(" ");
            int H = Integer.parseInt(testCase[0]);
            int N = Integer.parseInt(testCase[2]);
            getRoom(H, N);
        }

    }

    static void getRoom(int H, int N) {

        int floor = 0;
        int room = 0;

        if (N % H == 0) {
            floor = H;
            room = N / H;
        } else {
            floor = N % H;
            room = (N / H) + 1;
        }
        
        System.out.println(floor + String.format("%02d", room));
    }
}



