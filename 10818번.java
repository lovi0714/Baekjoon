import java.util.Scanner;

public class Main{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int[] a = new int[n];
		for(int idx=0;idx<n;idx++) {
		    a[idx] = sc.nextInt();
		}
		int max = a[0];
		int min = a[0];
		for(int i = 0; i< a.length; i++) {
			if(a[i]>max) {
				max =a[i];
			}else if(a[i]<min) {
				min = a[i];
			} 
		}
		System.out.println(min+" "+max);
	}
}
