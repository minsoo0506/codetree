import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Info {
    String name;
    int height;
    int weight;

    public Info(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void print() {
        System.out.println(name + " " + height + " " + weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        Info[] infos = new Info[n];
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            infos[i] = new Info(name, height, weight);
        }

        Arrays.sort(infos, new Comparator<Info>() {
            @Override
            public int compare(Info a, Info b){
                return a.height - b.height;
            }
        });

        for(int i = 0; i < n; i++){
            infos[i].print();
        }
    }
}