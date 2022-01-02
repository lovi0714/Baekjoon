import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스의 개수 받기
		int n = sc.nextInt();
		sc.nextLine();
		// 테스트 배열로 정리
		String [] tests = new String [n];
		for(int i = 0; i < n; i++) {
			tests[i] = sc.nextLine();
		}
		// 테스트 개수만큼 반복
		for(int c = 0; c < n; c++) {
			// 테스트 끝날 때마다 점수, 테스트 항목 초기화
			int point = 0;
			int total = 0;
			String tmp = tests[c];
			// 테스트 케이스 길이만큼 한글자씩 비교
			for(int d = 0; d < tmp.length(); d++) {
				// 'O'일 때 포인트 증가하면서 더해주기
				if(tmp.charAt(d)=='O') {
					point++;
					total += point;
					// 'X' 일 때 포인트 0부터 다시 시작
				}else if(tmp.charAt(d)=='X') {
					point = 0;
				}
			}
			// 테스트 끝날 때 마다 결과 출력
			System.out.println(total);
		}	
	}
}
