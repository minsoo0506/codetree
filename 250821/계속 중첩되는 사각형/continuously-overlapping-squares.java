import java.util.Scanner;
public class Main {
    public static final int OFFSET = 100;
    public static int[][] square;

    public static void colorRed(int x1, int y1, int x2, int y2) {
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                square[i][j] = 1;
            }
        }
    }

    public static void colorBlue(int x1, int y1, int x2, int y2) {
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                square[i][j] = -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        square = new int[201][201];

        int n = sc.nextInt();

        int color = 1;
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            if(color == 1) colorRed(x1, y1, x2, y2);
            else colorBlue(x1, y1, x2, y2);

            color *= -1;
        }

        int blueCount = 0;
        for(int i = 0; i <= 200; i++){
            for(int j = 0; j <= 200; j++){
                if(square[i][j] == -1) blueCount++;
            }
        }

        System.out.println(blueCount);
    }
}