import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int line = 1; line <= n; line++ ) {
				for(int space = line; space < n; space++) {
					System.out.print(" ");
				}
				for(int star = 0; star < line; star++ ) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
}
