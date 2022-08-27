public class Main {
    public static void main(String[] args){
        // 배열 생성
        int numbers[] = new int[10001];
        
        // 셀프 넘버가 이닌 숫자들은 1로 표시
        for (int i = 1; i < 10001; i++) {
            int notSelfNumber = d(i);

            if(notSelfNumber < 10001) {
                numbers[notSelfNumber] = 1;
            }
        }
        
        // 셀프 넘버가 아닌 숫자는 1로 표시 해두었기 때문에, 1이 아닌 것만 출력한다.
        for (int i = 1; i < 10001; i++) {
            if(numbers[i] != 1) System.out.println(i);
        }
    }
    
    // n은 d의 생성자
    static int d(int n) {
        return n + getNumberOfDigit(n);
    }
    
    // 각 자리수 합을 구하는 함수
    static int getNumberOfDigit(int number) {

        int total = 0;
        while(number != 0) {
            total += number % 10;
            number /= 10;
        }

        return total;
    }
}



