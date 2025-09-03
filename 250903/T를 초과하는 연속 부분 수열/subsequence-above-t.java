import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int maxCnt = 0;
        int cnt = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] > t && arr[i - 1] > t && arr[i] > arr[i - 1]){
                cnt++;
            }
            else {
                maxCnt = Math.max(maxCnt, cnt);
                cnt = 1;
            }
        }

        maxCnt = Math.max(maxCnt, cnt);

        if(maxCnt == 1) maxCnt = 0;
        System.out.println(maxCnt);
    }
}