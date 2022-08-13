import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static boolean[] primeList;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // testCase 갯수 입력 받기
        int testCount = Integer.parseInt(bf.readLine());

        // testCase 갯수만큼 반복
        for(int i = 0; i < testCount; i++){
            // 테스트 할 숫자 입력
            int number = Integer.parseInt(bf.readLine());
            // 두 소수 차이가 가장 작은 것을 구하기 위해 가운데 값 구하기
            int middle = number / 2;
            primeList = new boolean[number + 1];
            
            // 만약 가운데 값이 소수라면 그대로 출력
            if(getPrime(middle)) System.out.println(middle + " " + middle);
            else{
                // 가운데 값보다 큰 값만 배열에 담기
                ArrayList<Integer> list = getBiggerPrimeList(number);
                for(int index = 0; index < list.size(); index ++) {
                    // 가운데 값보다 큰 값 중 작은 수부터 입력 받은 수에서 빼서 그 수가 소수인지 확인하기
                    if(getPrime(number - list.get(index))) {
                        int a = number - list.get(index);
                        int b = list.get(index);
                        System.out.println(a + " " + b);
                        break;
                    }
                }
            }
        }
    }
    // 2로 나눈 숫자보다 큰 소수만 담기
    static ArrayList<Integer> getBiggerPrimeList(int n) {

        int middle = n / 2;
        ArrayList<Integer> biggerNumbers = new ArrayList<>();

        // false = 소수, 1은 소수가 아님
        primeList[0] = true;
        primeList[1] = true;

        for (int i = 2; i <= n; i++) {
            // primeList[i]가 소수라면
            if (!primeList[i]) {
                if(i > middle) biggerNumbers.add(i);
                // primeList[j]는 소수가 아닌 표시
                for (int j = i; j <= n; j += i) primeList[j] = true;
            }
        }

        return biggerNumbers;
    }
    // 소수인지 아닌지 판별하는 함수
    public static boolean getPrime(int number) {
            if(number == 1) return false;
            if(number == 2) return true;
            for (int index = 2; index < number; index++) {
                if(number % index == 0) return false;
            }
            return true;
        }
}
