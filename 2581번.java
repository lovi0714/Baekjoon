import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.parseInt(bf.readLine());
        int max = Integer.parseInt(bf.readLine());

        int total = 0;
        int answer = 0;

        for(; max >= min; max--) {
            if(isItDecimal(max)) {
                total += max;
                answer = max;
            }
        }

        if(total == 0) System.out.println(-1);
        if(total != 0) System.out.println(total+"\n"+answer);



    }
    static boolean isItDecimal(int number){
        if(number == 1) return false;
        if(number == 2) return true;
        for (int i = 2; i < number; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
