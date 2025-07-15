import java.util.Scanner;
public class Main {
    public static int calculate(int a, char o, int c){
        int result = 0;
        switch(o){
            case '+':
                result = a + c;
                break;

            case '-':
                result = a - c;
                break;
            
            case '*':
                result = a * c;
                break;
            
            case '/':
                result = a / c;
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.

        if(o != '+' && o != '-' && o != '*' && o != '/'){
            System.out.println("False");
            return;
        }

        int result = calculate(a, o, c);
        System.out.printf("%d %c %d = %d", a, o, c, result);
    }
}