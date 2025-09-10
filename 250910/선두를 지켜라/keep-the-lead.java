import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int endOfTime = 0;
        int[][] A = new int[n][2];
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();

            endOfTime += A[i][1];
        }

        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }

        int[][] measure = new int[endOfTime + 1][2];

        int aTime = 1;
        int bTime = 1;
        int idx = 0;
        int minIdx = n < m ? n : m;
        while(idx < minIdx) {
            for(int i = 1; i <= A[idx][1]; i++){
                if(aTime == 1){
                    measure[aTime][0] = A[idx][0];
                }
                else{
                    measure[aTime][0] = measure[aTime - 1][0] + A[idx][0];
                }

                aTime++;
            }

            for(int i = 1; i <= B[idx][1]; i++){
                if(bTime == 1){
                    measure[bTime][1] = B[idx][0];
                }
                else{
                    measure[bTime][1] = measure[bTime - 1][0] + B[idx][0];
                }

                bTime++;
            }

            idx++;
        }

        int result = 0;
        char lead = 'A';
        for(int i = 1; i <= endOfTime; i++) {
            if(measure[i][0] < measure[i][1]) {
                if(lead == 'A'){
                    result++;
                }
                lead = 'B';
            }
            else {
                if(lead == 'B'){
                    result++;
                }
                lead = 'A';
            }
        }

        System.out.println(result - 1);
    }
}