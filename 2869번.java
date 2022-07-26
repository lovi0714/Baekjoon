import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String tmp = bf.readLine();
        String[] parameters = tmp.split(" ");

        int a = Integer.parseInt(parameters[0]);
        int b = Integer.parseInt(parameters[1]);
        int v = Integer.parseInt(parameters[2]);
        bw.write(String.valueOf(getDays(a, b, v)));
        bw.flush();
        bw.close();
    }

    static int getDays(int a, int b, int v) {
        
        int day = (v - b) / (a - b);
        
        if((v - b) % (a - b) != 0) {
            day = day + 1;
        }
        
        return day;
    }
}
