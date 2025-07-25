import java.util.Scanner;

class Agent {
    char codeName;
    int score;

    public Agent (char codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }

    public void print(){
        System.out.println(codeName + " " + score);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.

        Agent[] agent = new Agent[5];
        int min = 100;
        int idx = -1;
        for(int i = 0; i < 5; i++){
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();
            agent[i] = new Agent(codeName, score);

            if(min > score) {
                min = score;
                idx = i;
            }
        }

        agent[idx].print();
    }
}