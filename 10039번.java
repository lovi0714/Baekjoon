import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 5명의 점수를 받을 배열 생성
		int[] grades = new int [5];
		// 5명의 점수 받기
		for (int i = 0; i < 5; i++) {
			grades[i] = sc.nextInt();
		}
		// 총점을 위한 변수 생성
		int tot = 0;
		// 40점 미만이면, 40점 고정. 아니면 그대로 덧셈
		for(int c = 0; c < 5; c++) {
			if(grades[c]<40) {
				grades[c] = 40;
			}
			tot += grades[c];
		}
		// 결과 출력
		System.out.println(tot/5);
	}
}
