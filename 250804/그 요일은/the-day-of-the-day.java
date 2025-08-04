import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int countA(int m1, int d1, int m2, int d2, String A) {
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // 기준일 누적일 계산
        int base = 0;
        for (int i = 1; i < m1; i++) {
            base += daysInMonth[i];
        }
        base += d1;

        // 목표일 누적일 계산
        int target = 0;
        for (int i = 1; i < m2; i++) {
            target += daysInMonth[i];
        }
        target += d2;

        int diff = target - base;
        int count = 0;
        int index = 0;
        for(int i = 1; i <= diff; i++){
            if(index == Arrays.asList(day).indexOf(A)) count++;

            index++;
            if(index == 6) index = 0;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        
        System.out.println(countA(m1, d1, m2, d2, A));
    }
}