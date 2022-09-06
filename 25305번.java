import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] param = br.readLine().split(" ");
        int students = Integer.parseInt(param[0]);
        int criteria = Integer.parseInt(param[1]);

        String[] tmp = br.readLine().split(" ");
        Integer[] score = new Integer[students];

        for (int i = 0; i < tmp.length; i++) {
            score[i] = Integer.parseInt(tmp[i]);
        }

        Arrays.sort(score, Collections.reverseOrder());


        System.out.println(score[criteria - 1]);

    }
}
