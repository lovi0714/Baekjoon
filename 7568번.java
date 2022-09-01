import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 전체 사람 수
        int count = Integer.parseInt(br.readLine());
        // 사람 수 만큼 배열 생성
        Person[] list = new Person[count];
        
        // 만들어둔 배열에 사람 kg,cm 정보 넣어주기
        for (int i = 0; i < list.length; i++) {
            String[] spec = br.readLine().split(" ");
            int kg = Integer.parseInt(spec[0]);
            int cm = Integer.parseInt(spec[1]);

            list[i] = new Person(kg, cm);
        }
        
        // 비교
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                // 둘 다 작으면 본인 + 1
                if(list[i].cm < list[j].cm && list[i].kg < list[j].kg)  list[i].grade += 1;
                // 둘 다 크면 비교 대상 + 1
                if(list[i].cm > list[j].cm && list[i].kg > list[j].kg)  list[j].grade += 1;
            }
            System.out.print(list[i].grade + " ");
        }
    }
}

class Person {
    int kg;
    int cm;
    int grade = 1;

    public Person(int kg, int cm) {
        this.kg = kg;
        this.cm = cm;
    }
}
