import java.util.Scanner;
public class Main {
    public static int n, m;
    public static int[] arr;

    public static int sum(){
        int result = 0;

        while(m >= 1){
            result += arr[m];

            if(m % 2 == 0) m /= 2;
            else m -= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.println(sum());
    }
}