import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(bf.readLine());
        int totalCount = Integer.parseInt(bf.readLine());

        int total = 0;


        for (int i = 0; i < totalCount; i++) {
            String tmp = bf.readLine();
            String[] priceAndCount = tmp.split(" ");

            int price = Integer.parseInt(priceAndCount[0]);
            int count = Integer.parseInt(priceAndCount[1]);

            total += price * count;
        }
        
        if(totalPrice == total) System.out.println("Yes");
        if(totalPrice != total) System.out.println("No");


    }
}



