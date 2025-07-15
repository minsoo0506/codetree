import java.util.Scanner;
public class Main {
    public static boolean isSubArray(int[] a, int[] b){
        boolean flag = false;

        if(a.length < b.length) return flag;

        for(int i = 0; i <= a.length - b.length; i++){
            if(a[i] == b[0]){
                flag = true;

                for(int j = 0; j < b.length; j++){
                    if(a[i + j] != b[j]){
                        flag = false;
                        break;
                    }
                }

                if(flag) break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.

        if(isSubArray(a, b)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}