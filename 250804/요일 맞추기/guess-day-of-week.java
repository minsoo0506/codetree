import java.util.Scanner;

public class Main {
    public static String calculateDay(int m1, int d1, int m2, int d2) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // 기준일 (m1, d1)까지의 누적 날짜
        int base = 0;
        for (int i = 1; i < m1; i++) {
            base += daysInMonth[i];
        }
        base += d1;

        // 목표일 (m2, d2)까지의 누적 날짜
        int target = 0;
        for (int i = 1; i < m2; i++) {
            target += daysInMonth[i];
        }
        target += d2;

        int diff = target - base;

        return day[(diff + 7) % 7];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(); 
        int d1 = sc.nextInt();
        int m2 = sc.nextInt(); 
        int d2 = sc.nextInt(); 

        System.out.println(calculateDay(m1, d1, m2, d2));
    }
}
