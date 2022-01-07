import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 숫자 7개 담을 배열
		int[] numbers = new int[7];
		for(int i=0;i<7;i++) {
			numbers[i]=sc.nextInt();
		}
		// 총 합, 홀수 담을 배열 선언
		int tot = 0;
		int[] nums = new int[7];
		// 홀수면 총 합계에 더하기
		for(int c=0;c<7;c++) {
			if(numbers[c]%2==1) {
				nums[c]=numbers[c];
				tot+=numbers[c];
			}else {
				nums[c]=99;
			}
		}
		// 전체 짝수면 tot는 0, -1 출력
		if(tot==0) {
			tot=-1;
			System.out.println(tot);
		}else {
			//오름차순 정렬, 가장 작은 수 출력
		Arrays.sort(nums);
		System.out.println(tot);
		System.out.println(nums[0]);
		}
	}
}
