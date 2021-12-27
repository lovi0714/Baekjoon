import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		
		String number = ""+(a*b*c);
		for (int i = 0; i < number.length(); i++) {
			char num = number.charAt(i);
			int num1 = num - '0';
			if(num1 == 0) {
				zero++;
				continue;
			}else if(num1 == 1) {
				one++;
				continue;
			}else if(num1 == 2) {
				two++;
				continue;
			}else if(num1 == 3) {
				three++;
				continue;
			}else if(num1 == 4) {
				four++;
				continue;
			}else if(num1 == 5) {
				five++;
				continue;
			}else if(num1 == 6) {
				six++;
				continue;
			}else if(num1 == 7) {
				seven++;
				continue;
			}else if(num1 == 8) {
				eight++;
				continue;
			}else if(num1 == 9) {
				nine++;
				continue;
			}	
		}
		System.out.println(zero);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		System.out.println(seven);
		System.out.println(eight);
		System.out.println(nine);
	}
}
