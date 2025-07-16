import java.util.Scanner;
public class Main {
    public static int[] arr;
    public static StringBuilder result;

    public static void printSum(int a1, int a2){
        int sum = 0;

        for(int i = a1 - 1; i <= a2 - 1; i++){
            sum += arr[i];
        }

        result.append(sum + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            printSum(a1, a2);
        }

        System.out.println(result);
    }
}