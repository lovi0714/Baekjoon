import java.util.Scanner;

public class Main{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] score = new int [n];
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		int m = score[0];
		double tot = 0;
		for (int b = 1; b < score.length; b++) {
			if(m<score[b]) {
				m = score[b];
			}
		}
		double newScore = 0;
		for (int c = 0; c < score.length; c++) {
			double s = (double)score[c];
			double max = (double)m;
			newScore = (s/m)*100;
			tot += newScore;
		}
		System.out.println(tot/n);
	}
}
