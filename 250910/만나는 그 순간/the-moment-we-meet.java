import java.util.Scanner;

class Direction {
    char heading;
    int time;

    public Direction(char heading, int time) {
        this.heading = heading;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Direction[] N = new Direction[n];
        Direction[] M = new Direction[m];

        for (int i = 0; i < n; i++) {
            char heading = sc.next().charAt(0);
            int time = sc.nextInt();
            N[i] = new Direction(heading, time);
        }

        for (int i = 0; i < m; i++) {
            char heading = sc.next().charAt(0);
            int time = sc.nextInt();
            M[i] = new Direction(heading, time);
        }

        int nLoc = 0, mLoc = 0;  
        int nIdx = 0, mIdx = 0;   
        int nRemain = (n > 0 ? N[0].time : 0);  
        int mRemain = (m > 0 ? M[0].time : 0);

        int time = 0;
        boolean meet = false;

        while (nIdx < n || mIdx < m) {
            time++;

            // N 이동
            if (nIdx < n) {
                if (N[nIdx].heading == 'R') nLoc++;
                else nLoc--;

                nRemain--;
                if (nRemain == 0) {
                    nIdx++;
                    if (nIdx < n) nRemain = N[nIdx].time;
                }
            }

            // M 이동
            if (mIdx < m) {
                if (M[mIdx].heading == 'R') mLoc++;
                else mLoc--;

                mRemain--;
                if (mRemain == 0) {
                    mIdx++;
                    if (mIdx < m) mRemain = M[mIdx].time;
                }
            }

            // 만남 체크
            if (nLoc == mLoc) {
                meet = true;
                break;
            }
        }

        System.out.println(meet ? time : -1);
    }
}
