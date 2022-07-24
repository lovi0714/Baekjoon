import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String tmp = bf.readLine();
        String[] abc = tmp.split(" ");
        int fixedCost = Integer.parseInt(abc[0]);
        int variableCost = Integer.parseInt(abc[1]);
        int salePrice = Integer.parseInt(abc[2]);

        System.out.println(calculateBreakEvenPoint(fixedCost, variableCost, salePrice));
    }

    static int calculateBreakEvenPoint(int fixedCost, int variableCost, int salePrice) {

        int answer = 0;

        if(variableCost >= salePrice) answer = -1;
        else answer = fixedCost / (salePrice - variableCost) + 1;

        return answer;
    }

}
