import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] block = new int[N + 1];

        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for(int j = A; j <= B; j++){
                block[j]++;
            }
        }
        
        int max = 0;
        for(int i = 0; i < block.length; i++){
            max = Math.max(max, block[i]);
        }

        System.out.println(max);
    }
}