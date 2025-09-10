import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int m = sc.nextInt(); 

        int[][] A = new int[n][2]; 
        int[][] B = new int[m][2];

        int totalTimeA = 0;
        int totalTimeB = 0;

        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
            totalTimeA += A[i][1];
        }

        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
            totalTimeB += B[i][1];
        }

        int endOfTime = Math.max(totalTimeA, totalTimeB); 
        int[][] measure = new int[endOfTime + 1][2];     


        int t = 1;
        int distance = 0;
        for (int i = 0; i < n; i++) {
            int speed = A[i][0];
            int duration = A[i][1];
            for (int j = 0; j < duration; j++) {
                distance += speed;
                measure[t][0] = distance;
                t++;
            }
        }


        t = 1;
        distance = 0;
        for (int i = 0; i < m; i++) {
            int speed = B[i][0];
            int duration = B[i][1];
            for (int j = 0; j < duration; j++) {
                distance += speed;
                measure[t][1] = distance;
                t++;
            }
        }

    
        int result = 0;
        char lead = 'N'; 

        for (int i = 1; i <= endOfTime; i++) {
            if (measure[i][0] == measure[i][1]) continue; 
            else if (measure[i][0] > measure[i][1]) {
                if (lead != 'A') {
                    result++;
                    lead = 'A';
                }
            } else { 
                if (lead != 'B') {
                    result++;
                    lead = 'B';
                }
            }
        }

        System.out.println(result - 1);
    }
}
