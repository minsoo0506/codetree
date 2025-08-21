import java.util.Scanner;

public class Main {
    public static final int OFFSET = 1000;
    public static int[][] square;

    public static void makeSquare(int x1, int y1, int x2, int y2, int type){
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                square[i][j] = type; // type이 1이면 첫번째 사각형, 0이면 두번째 사각형
            }
        }
    }

    public static int getMinArea() {
        int min_x = 2000;
        int min_y = 2000;
        int max_x = 0;
        int max_y = 0;

        for(int i = 0; i <= 2000; i++){
            for(int j = 0; j <= 2000; j++){
                if(square[i][j] == 1){
                    if(min_x > i) min_x = i;
                    if(min_y > j) min_y = j;
                    if(max_x < i) max_x = i;
                    if(max_y < j) max_y = j;
                }
            }
        }

        return (max_x + 1 - min_x) * (max_y + 1 - min_y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        square = new int[2001][2001];

        int rect1_x1 = sc.nextInt() + OFFSET;
        int rect1_y1 = sc.nextInt() + OFFSET;
        int rect1_x2 = sc.nextInt() + OFFSET;
        int rect1_y2 = sc.nextInt() + OFFSET;
        makeSquare(rect1_x1, rect1_y1, rect1_x2, rect1_y2, 1);

        int rect2_x1 = sc.nextInt() + OFFSET;
        int rect2_y1 = sc.nextInt() + OFFSET;
        int rect2_x2 = sc.nextInt() + OFFSET;
        int rect2_y2 = sc.nextInt() + OFFSET;
        makeSquare(rect2_x1, rect2_y1, rect2_x2, rect2_y2, 0);

        System.out.println(getMinArea());
    }
}