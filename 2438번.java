import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for (int idx=1;idx<=n;idx++){
	    	for(int cnt=1;cnt<=idx;cnt++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
		}
	}
}
