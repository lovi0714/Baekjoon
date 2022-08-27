import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 개수와 카드의 합 입력 받기
        String[] countAndQuestion = br.readLine().split(" ");

        int count = Integer.parseInt(countAndQuestion[0]);
        int question = Integer.parseInt(countAndQuestion[1]);
        
        // 카드 입력 받기
        int[] cards = new int[count];

        String[] numbers = br.readLine().split(" ");

        for (int i = 0; i < numbers.length; i++) {
            cards[i] = Integer.parseInt(numbers[i]);
        }

        int answer = 0;
        
        // 모든 경우의 수 구하기
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    // 지금까지의 수 중 가장 크며 주어진 카드의 합보다 크지 않은 수 구하기
                    if(sum > answer && sum <= question) answer = sum;
                }
            }
        }
        
        // 출력
        System.out.println(answer);

    }
}
