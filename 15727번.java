import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int t = 0;
		if(time%5!=0) {
			t = time/5+1;
		}else {
			t = time/5;
		}
		System.out.println(t);
	}
}
