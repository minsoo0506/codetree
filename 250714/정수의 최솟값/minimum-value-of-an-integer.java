import java.util.Scanner;

public class Main {
    public static void min(int a, int b, int c){
        int result = a;

        if(result > b) result = b;
        if(result > c) result = c;

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        min(a, b, c);
    }
}