import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.

        char[] word1_arr = word1.toCharArray();
        char[] word2_arr = word2.toCharArray();

        if(word1_arr.length != word2_arr.length) {
            System.out.println("No");
            return;
        }

        Arrays.sort(word1_arr);
        Arrays.sort(word2_arr);

        boolean flag = true;
        for(int i = 0; i < word1_arr.length; i++){
            if(word1_arr[i] != word2_arr[i]) flag = false;
        }

        if(flag) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}