import java.util.Scanner;
import java.util.Arrays;

class Grade implements Comparable<Grade>{
    String name;
    int korean;
    int english;
    int math;

    public Grade(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Grade o) {
        if(korean == o.korean) {
            if(english == o.english) {
                return o.math - math;
            }
            else {
                return o.english - english;
            }
        }
        else {
            return o.korean - korean;
        }
    }

    public void print() {
        System.out.println(name + " " + korean + " " + english + " " + math);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Grade[] grade = new Grade[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();

            grade[i] = new Grade(name, korean, english, math);
        }
        // Please write your code here.
        Arrays.sort(grade);

        for(int i = 0; i < n; i++){
            grade[i].print();
        }
    }
}