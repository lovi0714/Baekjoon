import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        // 알파벳 배열 & -1로 초기화
        int[] alphabets = new int[26];

        for(int i = 0; i < alphabets.length; i ++) {
            alphabets[i] = -1;
        }

        // 해당 index 찾아서 몇 번째로 등장했는지 입력
        for(int i = 0; i < word.length(); i++) {
            char alphabet = word.charAt(i);
            int wordIndex = alphabet - 'a';
            if(alphabets[wordIndex] == -1) alphabets[wordIndex] = i;
        }

        // 출력
        for(int i = 0; i < alphabets.length; i++) {
            System.out.print(alphabets[i] + " ");
        }
    }
}
