import java.util.Scanner;
public class Main {
    public static void divide(int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0) a[i] /= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        divide(arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}