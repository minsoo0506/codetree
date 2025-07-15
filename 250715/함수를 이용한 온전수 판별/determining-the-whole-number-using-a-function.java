import java.util.Scanner;
public class Main {
    public static boolean isMagicNum(int n){
        if(n % 2 == 0) return false;
        if(n % 10 == 5) return false;
        if(n % 3 == 0 && n % 9 != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        for(int i = a; i <= b; i++){
            if(isMagicNum(i)) count++;
        }

        System.out.println(count);
    }
}