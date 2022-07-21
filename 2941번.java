import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        // 변경된 크로아티아 알파벳이 있다면 2글자 -> 1글자로 변경
        if(word.contains("c=")) word = word.replace("c=", "1");
        if(word.contains("c-")) word = word.replace("c-", "1");
        if(word.contains("dz=")) word = word.replace("dz=","1");
        if(word.contains("d-")) word = word.replace("d-", "1");
        if(word.contains("lj")) word = word.replace("lj", "1");
        if(word.contains("nj")) word = word.replace("nj", "1");
        if(word.contains("s=")) word = word.replace("s=", "1");
        if(word.contains("z=")) word = word.replace("z=", "1");
        
        // 총 알파벳 개수 출력
        System.out.println(word.length());
    }
}
