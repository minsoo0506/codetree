import java.util.Scanner;
public class Main {
    public static boolean is3Multiple(int n){
        return n % 3 == 0;
    }

    public static boolean isMagicNum(int n){
        int digit1 = n / 10;
        int digit2 = n % 10;

        if(digit1 == 3 || digit1 == 6 || digit1 == 9){
            return true;
        } else if(digit2 == 3 || digit2 == 6 || digit2 == 9){
            return true;
        } else if (is3Multiple(n)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.

        long count = 0;
        for(int i = A; i <= B; i++){
            if(isMagicNum(i)) count++;
        }

        System.out.println(count);
    }
}