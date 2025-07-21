import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static int max(int[] a, int idx, int result){
        if(idx == -1) return result;

        result = Math.max(result, a[idx]);

        return max(a, idx - 1, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        System.out.println(max(arr, arr.length - 1, 0));
    }
}