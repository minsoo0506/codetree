import java.util.Scanner;
public class Main {
    public static boolean isRealDate(int m, int d){
        int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(m < 1 || m > 12) return false;
        if(d < 1 || d > date[m - 1]) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        if(isRealDate(m, d)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}