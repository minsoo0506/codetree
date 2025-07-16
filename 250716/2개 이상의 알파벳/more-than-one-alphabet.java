import java.util.Scanner;
public class Main {
    public static boolean checkDiffAlpha(String A){
        char[] check = new char[26];

        for(int i = 0; i < A.length(); i++){
            check[A.charAt(i) - 'a']++;
        }

        int count = 0;
        for(int i = 0; i < check.length; i++){
            if(check[i] > 0) count++;
        }

        return count >= 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        if(checkDiffAlpha(A)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}