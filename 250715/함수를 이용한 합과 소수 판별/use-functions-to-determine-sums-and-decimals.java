import java.util.Scanner;
public class Main {
    public static boolean isDigitEven(int n){
        String strNum = String.valueOf(n);
        char[] digit = strNum.toCharArray();

        int sum = 0;
        for(int i = 0; i < digit.length; i++){
            sum += digit[i];
        }

        return sum % 2 == 0;
    }

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

        int count = 0;
        for(int i = a; i <= b; i++){
            if(isDigitEven(i) && isPrime(i)){
                count++;
            }
        }

        System.out.println(count);
    }
}