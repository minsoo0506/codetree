import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static int F(int n){
        if(n < 10) return (int)Math.pow(n, 2);

        return (int)Math.pow(n % 10, 2) + F(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.println(F(n));
    }
}