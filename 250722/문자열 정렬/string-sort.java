import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.

        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        s = new String(charArr);

        System.out.println(s);
    }
}