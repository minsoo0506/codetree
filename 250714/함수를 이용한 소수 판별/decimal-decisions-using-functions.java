import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        int sum = 0;
        for(int i = a; i <= b; i++){
            if(isPrime(i)) sum += i;
        }

        System.out.println(sum);
    }
}