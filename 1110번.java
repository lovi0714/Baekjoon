import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		int a, b, c, d = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			c = n;
		while (true) {
			a = n/10;
			b = n%10;
			n = b*10 + ((a + b)%10);
			d++;
			if(c == n) {
				break;
			}
		}
		System.out.println(d);
	}
}
