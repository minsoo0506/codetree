import java.util.Scanner;
import java.util.Arrays;

class Info implements Comparable<Info>{
    String name;
    int height;
    int weight;

    public Info(String name, int height, int weight) {
        this.name = name;
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

    public void printInfo() {
        System.out.println(name + " " + height + " " + weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Info[] infos = new Info[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            
            infos[i] = new Info(name, height, weight);
        }

        Arrays.sort(infos);

        for (int i = 0; i < n; i++) {
            infos[i].printInfo();
        }
    }
}