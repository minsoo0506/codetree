import java.util.Scanner;
import java.util.Arrays;

class Info implements Comparable<Info>{
    int num;
    int height;
    int weight;

    public Info(int num, int height, int weight){
        this.num = num;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Info o){
        if(height == o.height) {
            if(weight == o.weight) {
                return num - o.num;
            }
            else {
                return o.weight - weight;
            }
        } 
        else {
            return o.height - height;
        }
    }

    public void printInfo() {
        System.out.println(height + " " + weight + " " + num);
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
        // Please write your code here.
        Arrays.sort(infos);

        for(int i = 0; i < n; i++) {
            infos[i].printInfo();
        }
    }
}