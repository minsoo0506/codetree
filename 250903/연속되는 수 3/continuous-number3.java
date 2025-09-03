import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        
        int maxCnt = 1;
        int cnt = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] * arr[i - 1] < 0){
                maxCnt = Math.max(maxCnt, cnt);
                cnt = 1;
            }
            else{
                cnt++;
            }
        }

        maxCnt = Math.max(maxCnt, cnt);
        System.out.println(maxCnt);
    }
}