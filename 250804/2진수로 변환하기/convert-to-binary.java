import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[20];
        int idx = 0;
        
        while(true) {
            if(n < 2) {
                digits[idx++] = n;
                break;
            }

            digits[idx++] = n % 2;
            n /= 2;
        }

        for(int i = idx - 1; i >= 0; i--){
            System.out.print(digits[i]);
        }
    }
}