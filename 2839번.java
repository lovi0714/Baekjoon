import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int deliveryAmount = Integer.parseInt(bf.readLine());

        System.out.println(getMinimumNumberOfBags(deliveryAmount));

    }

    static int getMinimumNumberOfBags(int deliveryAmount) {
        int heavy = 5;
        int light = 3;
        int count = 0;

        while (true) {
            if(deliveryAmount % heavy == 0) {
                count += deliveryAmount / heavy;
                break;
            }else {
                deliveryAmount -= light;
                count ++;
            }
            if(deliveryAmount < 0) {
                count = -1;
                break;
            }
        }

        return count;
    }
}



