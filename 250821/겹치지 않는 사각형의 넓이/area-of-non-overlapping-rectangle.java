import java.util.Scanner;
public class Main {
    public static final int OFFSET = 1000;
    public static int[][] square;

    public static void makeSquare(int x1, int y1, int x2, int y2){
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                square[i][j] = 1;
            }
        }
    }

    public static void deleteSquare(int x1, int y1, int x2, int y2){
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                square[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        square = new int[2001][2001];

        int ax1 = sc.nextInt() + OFFSET;
        int ay1 = sc.nextInt() + OFFSET;
        int ax2 = sc.nextInt() + OFFSET;
        int ay2 = sc.nextInt() + OFFSET;
        makeSquare(ax1, ay1, ax2, ay2);

        int bx1 = sc.nextInt() + OFFSET;
        int by1 = sc.nextInt() + OFFSET;
        int bx2 = sc.nextInt() + OFFSET;
        int by2 = sc.nextInt() + OFFSET;
        makeSquare(bx1, by1, bx2, by2);

        int mx1 = sc.nextInt() + OFFSET;
        int my1 = sc.nextInt() + OFFSET;
        int mx2 = sc.nextInt() + OFFSET;
        int my2 = sc.nextInt() + OFFSET;
        deleteSquare(mx1, my1, mx2, my2);

        int result = 0;
        for(int i = 0; i <= 2000; i++){
            for(int j = 0; j <= 2000; j++){
                if(square[i][j] == 1){
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}