import java.util.Scanner;
public class Main {
    public static final int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] square = new int[201][201];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    square[j][k] = 1;
                }
            }
        }

        int result = 0;
        for(int i = 0; i <= 200; i++){
            for(int j = 0; j <= 200; j++){
                if(square[i][j] == 1){
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}