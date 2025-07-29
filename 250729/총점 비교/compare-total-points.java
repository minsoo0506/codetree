import java.util.Scanner;
import java.util.Arrays;

class Grade implements Comparable<Grade>{
    String name;
    int score1;
    int score2;
    int score3;

    public Grade(String name, int score1, int score2, int score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    @Override
    public int compareTo(Grade o){
        return (score1 + score2 + score3) - (o.score1 + o.score2 + o.score3);
    }

    public void printInfo() {
        System.out.println(name + " " + score1 + " " + score2 + " " + score3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Grade[] grade = new Grade[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            grade[i] = new Grade(name, score1, score2, score3);
        }
        // Please write your code here.

        Arrays.sort(grade);

        for(int i = 0; i < n; i++){
            grade[i].printInfo();
        }
    }
}