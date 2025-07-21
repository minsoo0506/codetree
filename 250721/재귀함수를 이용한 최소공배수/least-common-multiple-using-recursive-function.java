import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static int lcm(int result, int[] a){
        boolean flag = true;

        for(int i = 0; i < a.length; i++){
            if(result % a[i] != 0) {
                flag = false;
                break;
            }
        }

        return flag ? result : lcm(result + 1, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        // Please write your code here.

        System.out.println(lcm(max, arr));
    }
}