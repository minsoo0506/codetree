import java.util.Scanner;
public class Main {
    public static boolean isPalindrome(String input){
        for(int i = 0; i < input.length() / 2; i++){
            if(input.charAt(i) != input.charAt(input.length() - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        if(isPalindrome(input)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}