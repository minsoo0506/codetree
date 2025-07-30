import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int janToEnd = 0;
        int janToStart = 0;

        for(int i = 1; i < m2; i++){
            janToEnd += days[i];
        }
        janToEnd += d2;

        for(int i = 1; i < m1; i++){
            janToStart += days[i];
        }
        janToStart += d1;

        System.out.println(janToEnd - janToStart + 1);
    }
}