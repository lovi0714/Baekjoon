import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int r = sc.nextInt();
			String s = sc.next();
		
			for(int w = 0; w < s.length(); w++) {
				for(int c = 0; c < r; c++) {
					System.out.print(s.charAt(w));
				  }
			  }
        System.out.println();
		  }
	  }
}
