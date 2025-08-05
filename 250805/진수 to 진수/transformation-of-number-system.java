import java.util.Scanner;
public class Main {
    public static String trans(int b, int n){
        int[] num = new int[20];
        int index = 0;

        while(true){
            if(n < b){
                num[index++] = n;
                break;
            }

            num[index++] = n % b;
            n /= b;
        }

        StringBuilder result = new StringBuilder();
        for(int i = index - 1; i >= 0; i--){
            result.append(num[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();

        int decimal = Integer.parseInt(N, A);
        System.out.println(trans(B, decimal));
    }
}