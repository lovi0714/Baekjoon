import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 알파벳 대문자로 된 단어 받기
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		// 총 걸린 시간을 위한 변수 선언
		int total = 0;
		// 1. 단어의 글자 수만큼 반복
		for(int i = 0; i < word.length(); i++) {
      // 2. 변수명 너무 길어 따로 ab 변수 생성
			char ab = word.charAt(i);
      // 3. 한 글자씩 비교 후 조건에 맞으면 실행할 내용 실행하고 continue로 반복문 처음으로 다시 돌아가기 
			if(ab=='A'||ab=='B'||ab=='C') {
				total += 3;
				continue;
			}
			if(ab=='D'||ab=='E'||ab=='F') {
				total += 4;
				continue;
			}
			if(ab=='G'||ab=='H'||ab=='I') {
				total += 5;
				continue;
			}
			if(ab=='J'||ab=='K'||ab=='L') {
				total += 6;
				continue;
			}
			if(ab=='M'||ab=='N'||ab=='O') {
				total += 7;
				continue;
			}
			if(ab=='P'||ab=='Q'||ab=='R'||ab=='S') {
				total += 8;
				continue;
			}
			if(ab=='T'||ab=='U'||ab=='V') {
				total += 9;
				continue;
			}
			if(ab=='W'||ab=='X'||ab=='Y'||ab=='Z') {
				total += 10;
				continue;
			}
		}
    // 결과 출력
		System.out.println(total);
	}
}
