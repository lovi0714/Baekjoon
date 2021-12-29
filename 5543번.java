import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//가격 입력 받기
		int[] foods = new int[5];
		for(int i = 0; i < 5; i ++) {
			foods[i] = sc.nextInt();
		}
		// 최소 가격 메뉴
		int minF = foods[0];
		int minB = foods[3];
		// 최소 가격 버거
		for(int c = 1; c < 3 ; c++) {
			if(minF > foods[c]) {
				minF = foods[c];
			}	
		}
		// 최소 가격 음료
		if(minB > foods[4]) {
			minB = foods[4];
		}
		// 세트 메뉴 -50원 할인
		System.out.println(minF+minB-50);
	}
}
