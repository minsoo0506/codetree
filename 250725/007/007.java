import java.util.*;
import java.io.*;

class Secret{
    String secretCode;
    char meetingPoint;
    int time;

    public Secret(String sCode, char mPoint, int time){
        this.secretCode = sCode;
        this.meetingPoint = mPoint;
        this.time = time;
    }

    public void print(){
        System.out.println("secret code : " + secretCode);
        System.out.println("meeting point : " + meetingPoint);
        System.out.println("time : " + time);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String sCode;
        char mPoint;
        int time;
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        sCode = st.nextToken();
        mPoint = st.nextToken().charAt(0);
        time = Integer.parseInt(st.nextToken());

        Secret secret = new Secret(sCode, mPoint, time);
        secret.print();
    }
}