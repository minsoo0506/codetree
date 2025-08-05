import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        int[] trans = new int[20];
        int index = 0;
        while(true) {
            if(n < b) {
                trans[index++] = n;
                break;
            }

            trans[index++] = n % b;
            n /= b;
        }

        for(int i = index - 1; i >= 0; i--){
            System.out.print(trans[i]);
        }
    }
}