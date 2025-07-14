import java.util.Scanner;
public class Main {
    public static void check(int n){
        int sum = 0;
        sum += (n / 10) + (n % 10);
        
        if(n % 2 == 0 && sum % 5 == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        check(n);
    }
}