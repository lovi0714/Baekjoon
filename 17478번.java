import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int count = 0;
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        getAnswer(n, count);
    }

    static void getAnswer(int n, int count) {

        if(n == 0) return;

        for(int i = 0; i < count; i++) System.out.print("____");
        System.out.println("\"재귀함수가 뭔가요?\"");

        for(int i = 0; i < count; i++) System.out.print("____");
        System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");

        for(int i = 0; i < count; i++) System.out.print("____");
        System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");

        for(int i = 0; i < count; i++) System.out.print("____");
        System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");


        n = n - 1;
        count += 1;

        getAnswer(n, count);

        if(n == 0) {
            for(int i = 0; i < count; i++) System.out.print("____");
            System.out.println("\"재귀함수가 뭔가요?\"");
            for(int i = 0; i < count; i++) System.out.print("____");
            System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            for(int i = 0; i < count; i++) System.out.print("____");
            System.out.println("라고 답변하였지.");
        }

        for(int i = 0; i < count - 1; i++) System.out.print("____");

        System.out.println("라고 답변하였지.");
    }
}

// 다른 풀이 
// 출처: https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-17478%EB%B2%88-%EC%9E%AC%EA%B7%80%ED%95%A8%EC%88%98%EA%B0%80-%EB%AD%94%EA%B0%80%EC%9A%94-%EC%9E%90%EB%B0%94Java

// import java.util.Scanner;

// public class Main {
//   static String underbar = "";
//   public static void recur(int N) {
    
//     String line = underbar;
    
//     // 재귀함수 종료
//     if(N == 0) {
//       System.out.println(line + "\"재귀 함수가 뭔가요?\"");
//       System.out.println(line + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
//       System.out.println(line + "라고 답변하였지.");
//       return;
//     }
    
//     // 재귀함수 반복
//     System.out.println(line + "\"재귀 함수가 뭔가요?\"");
//     System.out.println(line + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
//     System.out.println(line + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
//     System.out.println(line + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
    
//     // 줄 생성
//     underbar += "____";
    
//     recur(N - 1);
    
//     //맨 마지막
//     System.out.println(line + "라고 답변하였지.");   
//   }
  
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int N = sc.nextInt();
//     System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
//     recur(N);
//   } 
// }


