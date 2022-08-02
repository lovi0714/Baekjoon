import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bf.readLine());

        int floor = 1;
        int theHighestNumberOfThatFloor = 1;

        for (; ; ) {
            if(number <= theHighestNumberOfThatFloor) break;
            floor += 1;
            theHighestNumberOfThatFloor = theHighestNumberOfThatFloor + floor;
        }
      
        int a = 0;
        int b = 0;

        if((floor + 1) % 2 == 0) {
            a = 1 + (theHighestNumberOfThatFloor - number);
            b = floor - (theHighestNumberOfThatFloor - number);
        } else {
            a = floor - (theHighestNumberOfThatFloor - number);
            b = 1 + (theHighestNumberOfThatFloor - number);
        }

        System.out.println(a + "/" + b);

    }

}
