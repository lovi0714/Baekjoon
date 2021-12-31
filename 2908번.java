import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 두 숫자 문자열로 입력 받기
		String number1 = sc.next();
		String number2 = sc.next();
		// 두 숫자 순서 바꾸기
		String num1 = ""+number1.charAt(2)+number1.charAt(1)+number1.charAt(0);
		String num2 = ""+number2.charAt(2)+number2.charAt(1)+number2.charAt(0);
		// 정수형으로 변경해서 크기 비교하기
		if(Integer.parseInt(num1)>Integer.parseInt(num2)){
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
}
