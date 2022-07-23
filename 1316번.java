import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            words[i] = bf.readLine();
        }

        int answer = howManyGroupWords(words);

        System.out.println(answer);

    }

    static int howManyGroupWords(String[] words){

        int answer = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.length() <= 2) answer += 1;
            if(word.length() > 2 ) {
                answer += 1;
                for(int index = 0; index < word.length() - 1; index++) {
                    if(word.charAt(index) != word.charAt(index + 1)) {
                        String tmp = word.substring(index + 1);
                        if(tmp.indexOf(word.charAt(index)) != -1) {
                            answer -= 1;
                            break;
                        }
                    }
                }

            }
        }

        return answer;
    }

}
