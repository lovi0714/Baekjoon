import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 숫자의 개수 받기
		int n = sc.nextInt();
		// 숫자 n개 공백없이 받기
		sc.nextLine();
		String number = sc.nextLine();
		// 총 합계 변수 선언
		int total = 0;
		// 문자열로 받은 숫자 각 자리 떼내서 더하기
		for(int i = 0; i < number.length(); i++) {
			total += number.charAt(i) - '0';  
		}
		System.out.println(total);
	}
}
