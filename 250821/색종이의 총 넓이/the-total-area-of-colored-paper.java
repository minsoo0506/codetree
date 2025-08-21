import java.util.Scanner;
public class Main {
    public static final int OFFSET = 100;
    public static int[][] sqaure;

    public static void makeSqaure(int x1, int y1, int x2, int y2){
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                sqaure[i][j] = 1;
            }
        }
    }

    public static int getArea() {
        int result = 0;

        for(int i = 0; i <= 200; i++){
            for(int j = 0; j <= 200; j++){
                if(sqaure[i][j] == 1){
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sqaure = new int[201][201];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() + OFFSET;
            int y = sc.nextInt() + OFFSET;

            makeSqaure(x, y, x + 8, y + 8);
        }
        
        System.out.println(getArea());
    }
}