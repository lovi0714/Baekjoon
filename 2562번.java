import java.util.Scanner;

public class Main{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
    // 9개 정수 얻기
		int[] nums = new int[9];
		for(int i = 0;i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
    // 배열의 첫 번째 값으로 최대값을 초기화
		int max = nums[0];
    // 지역변수인 idx copy용
		int count = 0;
    // 최대값 얻기
		for(int idx = 1; idx < nums.length; idx++) {
			if(nums[idx]>max) {
				max = nums[idx];
				count = idx;
			}
		}
    // 최대값과 idx는 0부터니까 +1해주기
		System.out.println(max);
		System.out.println(count+1);
	}
}
