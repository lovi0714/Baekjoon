import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // 현재 시간
        String[] a = sc.nextLine().split(" ");
        int hour = Integer.parseInt(a[0]);
        int minute = Integer.parseInt(a[1]);
        
        // 소요 시간
        int requiredTime = sc.nextInt();
        
        // 완료 시간
        CookedTime time = getFinishedTime(hour, minute, requiredTime);
        hour = time.getHour();
        minute = time.getMinute();
        
        System.out.println(hour + " " + minute);

    }

    static CookedTime getFinishedTime(int hour, int minute, int requiredTime) {

        minute = minute + requiredTime;

        if(minute >= 60) {
            hour += minute / 60;
            minute = minute % 60;
        }
        if(hour >= 24) hour = hour - 24;

        CookedTime cookedTime = new CookedTime(hour,minute,requiredTime);

        return cookedTime;
    }

}
class CookedTime {
    private int hour;
    private int minute;
    private int requiredTime;

    public CookedTime(int hour, int minute, int requiredTime) {
        this.hour = hour;
        this.minute = minute;
        this.requiredTime = requiredTime;
    }

    public CookedTime() {

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getRequiredTime() {
        return requiredTime;
    }
}
