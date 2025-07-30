import java.util.Scanner;
import java.util.Arrays;

class Info implements Comparable<Info>{
    int id;
    int height;
    int weight;

    public Info(int id, int height, int weight) {
        this.id = id;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Info o) {
        if(this.height == o.height) {
            return o.weight - this.weight;
        } 
        else {
            return this.height - o.height;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Info[] infos = new Info[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();

            infos[i] = new Info(i + 1, height, weight);
        }
        
        Arrays.sort(infos);

        for (int i = 0; i < n; i++) {
            System.out.println(infos[i].height + " " + infos[i].weight + " " + infos[i].id);
        }
    }
}