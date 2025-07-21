import java.util.Scanner;
public class Main {
    public static int F(int n){
        if(n == 1) return 0;

        if(n % 2 == 0){
            n /= 2;
        }
        else {
            n = n * 3 + 1;
        }

        return 1 + F(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.println(F(n));
    }
}