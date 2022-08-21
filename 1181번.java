import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<String>();

        for(int i = 0; i < N; i++) {
            String word = br.readLine();
            list.add(word);
        }

        Collections.sort(list);

        for(int i = 1; i <= 50; i++) {
            for(int j = 0; j < list.size();) {
                if(list.get(j).length() == i) {
                    sb.append(list.get(j)).append("\n");
                    list.removeAll(Arrays.asList(list.get(j)));
                }else {
                    j++;
                }
            }
            if(list.isEmpty()) break;
        }
        System.out.println(sb);
    }

}
