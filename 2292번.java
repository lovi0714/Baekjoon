import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String tmp = bf.readLine();
        int destination = Integer.parseInt(tmp);
        int floor = 1;
        int theHighestNumberOfThatFloor = 1;

        for(;;){
            if(destination <= maxFloor) break;
            theHighestNumberOfThatFloor = theHighestNumberOfThatFloor + 6 * floor;
            floor += 1;
        }

        System.out.println(floor);
    }

}
