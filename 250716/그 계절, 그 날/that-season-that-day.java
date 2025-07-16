import java.util.Scanner;
public class Main {
    public static boolean isLeapYear(int y){
        if(y % 4 != 0) return false;
        if(y % 4 == 0 && y % 100 == 0) return false;
        if(y % 4 == 0 && y % 100 == 0 && y % 400 == 0) return true;
        return true;
    }

    public static void checkSeason(int y, int m, int d){
        int[] leap_year = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] not_leap_year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(isLeapYear(y)){
            if (m < 1 || m > 12){
                System.out.println(-1);
            } else if (d < 1 || d > leap_year[m - 1]){
                System.out.println(-1);
            } else {
                if(m >= 3 && m <= 5){
                    System.out.println("Spring");
                } else if(m >= 6 && m <= 8){
                    System.out.println("Summer");
                } else if(m >= 9 && m <= 11){
                    System.out.println("Fall");
                } else {
                    System.out.println("Winter");
                }
            }
        } else{
            if (m < 1 || m > 12){
                System.out.println(-1);
            } else if (d < 1 || d > not_leap_year[m - 1]){
                System.out.println(-1);
            } else {
                if(m >= 3 && m <= 5){
                    System.out.println("Spring");
                } else if(m >= 6 && m <= 8){
                    System.out.println("Summer");
                } else if(m >= 9 && m <= 11){
                    System.out.println("Fall");
                } else {
                    System.out.println("Winter");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        checkSeason(y, m, d);
    }
}