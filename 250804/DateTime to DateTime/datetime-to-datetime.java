import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int endMinute = (A * 1440) + (B * 60) + C;
        int startMinute = (11 * 1440) + (11 * 60) + 11; 

        if(endMinute < startMinute) {
            System.out.println(-1);
            return;
        }

        System.out.println(endMinute - startMinute);
    }
}