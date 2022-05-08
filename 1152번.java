import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.print(getWordCnt(sentence));
    }
    static int getWordCnt(String sentence){
        // 문자 앞 뒤 공백 제거
        sentence = sentence.trim();
        // 공백만 입력 받았을 때 처리
        if(sentence.isBlank()) return 0;
        // 공백을 구분자로 자르기
        String[] words = sentence.split(" ");
        return words.length;
    }
}
