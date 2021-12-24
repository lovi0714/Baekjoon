import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int line = 0; line < n; line++) {
			for(int star = line; star < n; star++) {
				System.out.print("*");
			}
			System.out.println();
			for(int space = 0; space <=  line; space ++ ) {
				System.out.print(" ");
			}
		}
	}
}
