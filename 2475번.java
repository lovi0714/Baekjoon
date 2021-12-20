import java.util.Scanner;

public class Main{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		int tot = 0;
		for (int i = 1; i <=5; i++) {
			int n = sc.nextInt();
			temp = n*n;
			tot += temp;
		}
		System.out.println(tot%10);
	}
}
