import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int cnt = 1; cnt <= 3; cnt++) {
			int total = 0;
			for (int i = 1; i <= 4; i++) {
				int stick = sc.nextInt();
				total += stick;
			}
			if (total == 3) {
				System.out.println("A");
			} else if (total == 2) {
				System.out.println("B");
			} else if (total == 1) {
				System.out.println("C");
			} else if (total == 0) {
				System.out.println("D");
			} else {
				System.out.println("E");
			}
		}
	}
}
