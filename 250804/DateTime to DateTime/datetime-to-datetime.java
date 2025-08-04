import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int count = 0;

        int a = 11;
        int b = 11;
        int c = 11;
        while(true) {
            if(a == A && b == B && c == C) break;

            if(c == 60) {
                b++;
                c = 0;
            }

            if(b == 24) {
                a++;
                b = 0;
            }

            c++;
            count++;
        }

        System.out.println(count);
    }
}