import java.util.Scanner;
public class Main {
    public static boolean is3Multiple(int n){
        return n % 3 == 0;
    }

    public static boolean isMagicNum(int n){
        String strNum = String.valueOf(n);
        char[] digit = strNum.toCharArray();

        for(int i = 0; i < digit.length; i++){
            if(digit[i] == '3' || digit[i] == '6' || digit[i] == '9'){
                return true;
            }
        }

        if (is3Multiple(n)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.

        int count = 0;
        for(int i = A; i <= B; i++){
            if(isMagicNum(i)) count++;
        }

        System.out.println(count);
    }
}