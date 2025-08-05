import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        
        int[] binaryArr = new int[binary.length()];
        for(int i = 0; i < binaryArr.length; i++){
            binaryArr[i] = binary.charAt(i) - '0';
        }

        int num = 0;
        for(int i = 0; i < binaryArr.length; i++){
            num = num * 2 + binaryArr[i];
        }

        System.out.println(num);
    }
}