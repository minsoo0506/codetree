import java.util.Scanner;
public class Main {
    public static long toBinary(int n){
        int[] binaryArr = new int[20];
        int index = 0;

        while(true){
            if(n < 2) {
                binaryArr[index++] = n;
                break;
            }

            binaryArr[index++] = n % 2;
            n /= 2;
        }

        StringBuilder result = new StringBuilder();
        for(int i = index - 1; i >= 0; i--){
            result.append(binaryArr[i]);
        }

        return Long.parseLong(result.toString());
    }

    public static int toDecimal(int[] binaryArr){
        int num = 0;
        for(int i = 0; i < binaryArr.length; i++){
            num = num * 2 + binaryArr[i];
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();

        int[] binaryArr = new int[binary.length()];
        for(int i = 0; i < binaryArr.length; i++){
            binaryArr[i] = binary.charAt(i) - '0';
        }
        
        System.out.println(toBinary(toDecimal(binaryArr) * 17));
    }
}