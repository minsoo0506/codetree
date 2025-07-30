import java.util.Scanner;
import java.util.Arrays;

class Num {
    int idx;
    int data;

    public Num(int idx, int data) {
        this.idx = idx;
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Num[] numArr = new Num[n];
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            numArr[i] = new Num(i + 1, data);
        }
        
        Arrays.sort(numArr, (a, b) -> a.data - b.data);

        int[] arrRank = new int[n + 1];

        for(int i = 0; i < n; i++) {
            arrRank[numArr[i].idx] = (i + 1);
        }

        for(int i = 1; i <= n; i++) {
            System.out.print(arrRank[i] + " ");
        }
    }
}