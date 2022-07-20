import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.toUpperCase();

        // 알파벳 배열
        int[] alphabets = new int[26];
        int maxIndex = 0;

        // 해당 알파벳이 몇 번 사용되었는지 +1로 체크
        for(int i = 0; i < word.length(); i++) {
            char alphabet = word.charAt(i);
            int wordIndex = alphabet - 'A';
            alphabets[wordIndex] += 1;
        }

        // 임시 배열 복사
        int[] tmp = new int[26];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = alphabets[i];
        }
        // 먼저 정렬을 통해 가장 많이 사용된 알파벳이 2개 이상인지 체크
        Arrays.sort(tmp);
      
        if(tmp[25] == tmp[24]) {
            System.out.println("?");
        } else{
            // 아니라면 가장 많은 개수의 알파벳을 제일 앞으로 보내면서 비교 , 해당 인덱스 구하기
            for (int i = 0; i < alphabets.length; i++) {
                if(alphabets[i] > alphabets[0]) {
                    alphabets[0] = alphabets[i];
                    maxIndex = i;
                }
            }

            // 무슨 알파벳인지 구하기
            int answerCode = maxIndex + 'A';
            char answer = (char)answerCode;

            // 출력
            System.out.println(answer);
        }
    }
}
