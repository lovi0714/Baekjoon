import java.util.Scanner;

public class Main{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[8];
		int b = 1;
		int c = 8;
		int ascending = 0;
		int decending = 0;
		for(int idx = 0; idx < a.length; idx++) {
			a[idx] = sc.nextInt();
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] == b) {
				ascending++;
			}else if(a[i] == c) {
				decending++;
			}
			b++;
			c--;
		}
		if(ascending==8) {
			System.out.println("ascending");
		}else if(decending==8) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}
